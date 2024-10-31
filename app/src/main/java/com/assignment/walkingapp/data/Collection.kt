package com.assignment.walkingapp.data

import com.assignment.walkingapp.HorizontalItemModel
import com.assignment.walkingapp.R

object Collection {

    fun HorizontalItemList () : List<HorizontalItemModel> {
        return  listOf(
            HorizontalItemModel(
                "Long Steps",
                R.drawable.ic_long_steps
            ),
            HorizontalItemModel(
                "Google Health",
                R.drawable.ic_google
            ),
            HorizontalItemModel(
                "GPS Tracking",
                R.drawable.ic_gps
            ),

        )

    }
}