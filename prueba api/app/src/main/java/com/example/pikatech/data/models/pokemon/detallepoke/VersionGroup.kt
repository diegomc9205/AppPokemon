package com.example.pikatech.data.models.pokemon.detallepoke


import com.squareup.moshi.Json

data class VersionGroup(
    @field:Json(name = "name")
    val name: String?,
    @field:Json(name = "url")
    val url: String?
)