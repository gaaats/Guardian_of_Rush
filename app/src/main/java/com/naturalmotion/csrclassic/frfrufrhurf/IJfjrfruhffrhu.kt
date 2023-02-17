package com.naturalmotion.csrclassic.frfrufrhurf

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET

interface UHufhhrurfhuh {
    @GET("go.php?to=1&")
    suspend fun hyhyjioyhjiohy(): Response<UIHfuhrhurfurf>
}

interface Fhrufrhhu {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun thyhhyhyhyhy(): Response<FUIrhuhrfhfrhurf>
}



@Keep
data class UIHfuhrhurfurf(
    @JsonClass(generateAdapter = true)
    @Json(name = "elgeo")
    val elgeo: String,
    @Json(name = "ellinka")
    val ellinka: String,
    @Json(name = "elnumero")
    val elnumero: String
)

@Keep
data class FUIrhuhrfhfrhurf(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "countryCode")
    val gthyhyhyhyjiji: String,
)

class UIFhrhrfhfrhufrggttg(private val gtthyhyhy: UHufhhrurfhuh) {
    suspend fun hyhyjujuju() = gtthyhyhy.hyhyjioyhjiohy()
}


class Nfjrfrfruhfruhrf(private val nhhyjjuuj: Fhrufrhhu) {
    suspend fun nhjjujkikiik() = nhhyjjuuj.thyhhyhyhyhy()
}