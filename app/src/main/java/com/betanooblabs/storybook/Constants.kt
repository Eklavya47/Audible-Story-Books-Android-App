package com.betanooblabs.storybook

object Constants {

    fun getStoryList(): ArrayList<Story>{

        val storyList = ArrayList<Story>()

        storyList.add(
            Story(
                title = R.string.title1,
                story = R.string.story1,
                moral = R.string.moral1,
                image = R.drawable.rv_image1,
                image2 = R.drawable.image1
            )
        )

        storyList.add(
            Story(
                title = R.string.title2,
                story = R.string.story2,
                moral = R.string.moral2,
                image = R.drawable.rv_image2,
                image2 = R.drawable.image2
            )
        )

        storyList.add(
            Story(
                title = R.string.title3,
                story = R.string.story3,
                moral = R.string.moral3,
                image = R.drawable.rv_image3,
                image2 = R.drawable.image3
            )
        )

        storyList.add(
            Story(
                title = R.string.title4,
                story = R.string.story4,
                moral = R.string.moral4,
                image = R.drawable.rv_image4,
                image2 = R.drawable.image4
            )
        )

        storyList.add(
            Story(
                title = R.string.title5,
                story = R.string.story5,
                moral = R.string.moral5,
                image = R.drawable.rv_image5,
                image2 = R.drawable.image5
            )
        )

        storyList.add(
            Story(
                title = R.string.title6,
                story = R.string.story6,
                moral = R.string.moral6,
                image = R.drawable.rv_image6,
                image2 = R.drawable.image6
            )
        )

        storyList.add(
            Story(
                title = R.string.title7,
                story = R.string.story7,
                moral = R.string.moral7,
                image = R.drawable.rv_image7,
                image2 = R.drawable.image7
            )
        )

        storyList.add(
            Story(
                title = R.string.title8,
                story = R.string.story8,
                moral = R.string.moral8,
                image = R.drawable.rv_image8,
                image2 = R.drawable.image8
            )
        )

        storyList.add(
            Story(
                title = R.string.title9,
                story = R.string.story9,
                moral = R.string.moral9,
                image = R.drawable.rv_image9,
                image2 = R.drawable.image9
            )
        )

        storyList.add(
            Story(
                title = R.string.title10,
                story = R.string.story10,
                moral = R.string.moral10,
                image = R.drawable.rv_image10,
                image2 = R.drawable.image10
            )
        )

        return storyList
    }
}