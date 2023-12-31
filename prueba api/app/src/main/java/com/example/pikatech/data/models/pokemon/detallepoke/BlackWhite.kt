package com.example.pikatech.data.models.pokemon.detallepoke


import com.squareup.moshi.Json

data class BlackWhite(
    @field:Json(name = "animated")
    val animated: Animated?,
    @field:Json(name = "back_default")
    val backDefault: String?,
    @field:Json(name = "back_female")
    val backFemale: Any?,
    @field:Json(name = "back_shiny")
    val backShiny: String?,
    @field:Json(name = "back_shiny_female")
    val backShinyFemale: Any?,
    @field:Json(name = "front_default")
    val frontDefault: String?,
    @field:Json(name = "front_female")
    val frontFemale: Any?,
    @field:Json(name = "front_shiny")
    val frontShiny: String?,
    @field:Json(name = "front_shiny_female")
    val frontShinyFemale: Any?
)