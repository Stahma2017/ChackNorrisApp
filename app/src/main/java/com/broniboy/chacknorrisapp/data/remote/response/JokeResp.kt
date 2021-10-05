package com.broniboy.chacknorrisapp.data.remote.response

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class JokeResp(
    @Json(name = "categories") val categories: List<String>,
    @Json(name = "created_at") val createdAt: String,
    @Json(name = "icon_url") val iconUrl: String,
    @Json(name = "id") val id: Long,
    @Json(name = "updated_at") val updatedAt: String,
    @Json(name = "url") val url: String,
    @Json(name = "value") val value: String
) : Parcelable