package com.betanooblabs.storybook

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.betanooblabs.storybook.databinding.ActivityStoryBinding
import java.time.ZoneOffset
import java.util.Locale

class StoryActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    private var tts: TextToSpeech? = null
    private var binding: ActivityStoryBinding? = null
    private var position = 0
    private lateinit var storyList: ArrayList<Story>
    private lateinit var speakableText: String
    private var isPlaying = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityStoryBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        position = intent.getIntExtra("position", 0)
        storyList = Constants.getStoryList()
        tts = TextToSpeech(this, this)
        setStoryView()
        setSpeakableText()

        binding?.btnNext?.setOnClickListener {
            if (position < storyList.size-1){
                onStoryChange(1)
                setStoryView()
            }
            else{
                Toast.makeText(this, "No more stories", Toast.LENGTH_SHORT).show()
            }
        }

        binding?.btnPrevious?.setOnClickListener {
            if (position > 0){
                onStoryChange(-1)
                setStoryView()
            }
            else{
                Toast.makeText(this, "No more stories", Toast.LENGTH_SHORT).show()
            }
        }

        binding?.btnPlay?.setOnClickListener { playStory() }
    }

    private fun onStoryChange(offset: Int){
        tts?.stop()
        position += offset
        isPlaying = false
        setStoryView()
        binding?.btnPlay?.setImageResource(R.drawable.play)
        setSpeakableText()
    }

    private fun playStory(){
        if (!isPlaying){
            isPlaying = true
            speakOut(speakableText)
            binding?.btnPlay?.setImageResource(R.drawable.pause)
        }
        else{
            isPlaying = false
            tts!!.stop()
            binding?.btnPlay?.setImageResource(R.drawable.play)
        }
    }

    private fun setStoryView(){
        val story = storyList[position]
        binding?.storyImage?.setImageResource(story.image2)
        binding?.tvStoryTitle?.setText(story.title)
        binding?.tvStory?.setText(story.story)
        binding?.tvMoral?.setText(story.moral)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS){
            val result = tts!!.setLanguage(Locale.ENGLISH)
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED){
                Toast.makeText(this, "Language not supported", Toast.LENGTH_SHORT).show()
            }
        }
        else{
            Toast.makeText(this, "TTS Initialization failed", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setSpeakableText(){
        speakableText = getString(storyList[position].story) + "The moral of the story is "+
                getString(storyList[position].moral)
    }

    private fun speakOut(text: String){
        tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onDestroy() {
        super.onDestroy()
        if (tts != null){
            tts!!.stop()
            tts!!.shutdown()
        }
        binding = null
    }
}