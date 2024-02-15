package com.example.movieapp.movieList.presentation

import com.example.movieapp.movieList.domain.model.Movie

data class MovieListState(
    val isLoading: Boolean = false,
    val isCurrentPopularScreen: Boolean = true,

    val popularMovieListPage: Int = 1,
    val upcomingMovieListPage: Int = 1,

    val popularMovieList: List<Movie> = emptyList(),
    val upcomingMovieList: List<Movie> = emptyList(),
)