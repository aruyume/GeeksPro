package com.example.geeks.model

import java.io.Serializable

data class CarModel(
    val name: String,
    val year: Int,
    val image: String
) : Serializable
