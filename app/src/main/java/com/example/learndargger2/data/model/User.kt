package com.example.learndargger2.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    var name: String? = null,

    var image: String? = null
)
