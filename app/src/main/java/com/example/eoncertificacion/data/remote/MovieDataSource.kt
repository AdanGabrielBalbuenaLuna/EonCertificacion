package com.example.eoncertificacion.data.remote

import com.example.eoncertificacion.data.model.MovieList

class MovieDataSource {

    fun getUpcomingMovies(): MovieList{
        return MovieList()
    }

    fun getTopRatedMovies(): MovieList{
        return MovieList()
    }

    fun getPopularMovies(): MovieList{
        return MovieList()
    }
}