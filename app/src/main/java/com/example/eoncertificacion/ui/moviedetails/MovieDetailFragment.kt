package com.example.eoncertificacion.ui.moviedetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.eoncertificacion.R
import com.example.eoncertificacion.databinding.FragmentMovieDetailBinding

class MovieDetailFragment : Fragment(R.layout.fragment_movie) {

    //Clase que se genera para hacer referencia a todos los elementos que estan en MovieDetailFragment
    //Se usa lateinit para indicar que se promete inicializar lo mas pronto posible
    private lateinit var binding: FragmentMovieDetailBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}