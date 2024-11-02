package com.example.geeks.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.geeks.databinding.FragmentCarDetailBinding
import com.example.geeks.model.CarModel
import com.example.geeks.utils.loadImage

class CarDetailFragment : Fragment() {

    private val binding by lazy {
        FragmentCarDetailBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getKey()
    }

    private fun getKey() {
        val model = arguments?.getSerializable(KEY_CAR) as CarModel
        binding.apply {
            tvNameDetail.text = model.name
            tvYearDetail.text = model.year.toString()
            imgCarDetail.loadImage(model.image)
        }
    }

    companion object {
        private const val KEY_CAR = "key_car"
    }
}