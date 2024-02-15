package com.example.movieapp.details.presentation

import com.example.movieapp.movieList.domain.model.Movie

data class DetailsState(
    val isLoading: Boolean = false,
    val movie: Movie? = null,


)
