package com.example.eoncertificacion.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.eoncertificacion.R
import com.example.eoncertificacion.databinding.FragmentMovieBinding

class MovieFragment : Fragment(R.layout.fragment_movie) {

    //Clase que se genera para hacer referencia a todos los elementos que estan en MovieDetailFragment
    //Se usa lateinit para indicar que se promete inicializar lo mas pronto posible
    private lateinit var binding: FragmentMovieBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Se le pasa la vista
        binding = FragmentMovieBinding.bind(view)
        //Acceder a cada uno de los elementos sin necesidad del findVIewById
        binding.progressBar.visibility = View.GONE
    }
}