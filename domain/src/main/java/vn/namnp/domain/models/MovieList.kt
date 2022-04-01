package vn.namnp.domain.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MovieList(
    @SerializedName("results")
    val movies: List<Movie>
): Serializable
