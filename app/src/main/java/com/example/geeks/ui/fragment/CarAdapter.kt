package com.example.geeks.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.geeks.databinding.ItemCarBinding
import com.example.geeks.model.CarModel
import com.example.geeks.utils.loadImage

class CarAdapter(
    private var list: List<CarModel>,
    private val onClick: (model: CarModel) -> Unit
) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCarBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class ViewHolder(private var binding: ItemCarBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(car: CarModel) {
            binding.apply {
                tvName.text = car.name
                tvYear.text = car.year.toString()
                imgCar.loadImage(car.image)
                itemView.setOnClickListener() {
                    onClick(car)
                }
            }
        }
    }
}