package com.example.geeks.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.geeks.R
import com.example.geeks.databinding.FragmentCarBinding
import com.example.geeks.model.CarModel

class CarFragment : Fragment() {

    private val binding by lazy {
        FragmentCarBinding.inflate(layoutInflater)
    }

    private val carList = arrayListOf(
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pngwing.com%2Fen%2Fsearch%3Fq%3Dcar&psig=AOvVaw38vD9xoVkmiblAZwRQ_LNC&ust=1730635389999000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCNiwwq7NvYkDFQAAAAAdAAAAABAE"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS"),
        CarModel("BMW", 2006, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.volvocars.com%2F&psig=AOvVaw1oSyDB-kiNu1OFHJyOLmWK&ust=1730634924610000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCMjo5dHLvYkDFQAAAAAdAAAAABAS")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        binding.rvCars.adapter = CarAdapter(carList, this::onClick)
    }

    private fun onClick(carModel: CarModel) {
        findNavController().navigate(R.id.carDetailFragment, bundleOf(KEY_CAR to carModel))
    }

    companion object {
        private const val KEY_CAR = "key_car"
    }
}