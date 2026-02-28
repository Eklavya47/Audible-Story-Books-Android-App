📚 Story Book Android App
A simple Story Book app built using Kotlin and XML. This app displays a collection of stories with moral lessons, featuring a clean list view and a detailed reading screen. It uses a local data source to provide offline access to all stories and includes a built-in narrator for an immersive experience.

✨ Features
🏠 Splash Screen – A welcoming start to the app experience.
📋 Story List – Browse through a curated collection of stories with preview images.
📖 Story Reading – Read full stories with detailed illustrations and moral lessons.
🎙️ Audio Narration – Listen to stories with integrated Text-to-Speech (TTS) technology.
🎨 Material Design – Built with classic Android UI components for a familiar feel.
🖼️ Visual Storytelling – Each story is accompanied by beautiful images.
💡 Moral Lessons – Every story concludes with a valuable life lesson.

📸 Screenshots
Splash Screen | Story List | Reading Screen

⚙️ Tech Stack
Language: Kotlin
UI Framework: XML (View Binding)
Architecture: Standard Android Architecture
Data Management: Local Constants
Audio: Text-to-Speech (TTS)
Image Loading: Android Drawable resources

📂 Project Structure
com/betanooblabs/storybook/: Main package containing Activities and Adapter
Constants.kt: Local data source containing story content
Story.kt: Data model for stories
MainActivity.kt: Host for the story list
StoryActivity.kt: Screen for reading and listening to individual stories
SplashScreenActivity.kt: Initial entry screen
res/layout/: XML layouts for all screens
res/values/: Resource files for strings, colors, and styles

🚀 Getting Started
Follow these steps to run the project locally:
1. Clone the repository
2. Open the project in Android Studio
3. Sync the project with Gradle files
4. Run the app on an emulator or physical device

🔧 Requirements
Android Studio Hedgehog or later
Minimum SDK: 23
Target SDK: 36
Kotlin 1.9.0 or higher

🤝 Contributing
Contributions are welcome! If you'd like to fix a bug or add a feature, feel free to fork the repository and submit a pull request.
