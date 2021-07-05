package com.example.eoncertificacion.repository

import com.example.eoncertificacion.data.model.MovieList

interface MovieRepository {
    fun getUpcomingMovies(): MovieList
    fun getTopRatedMovies(): MovieList
    fun getPopularMovies(): MovieList
}