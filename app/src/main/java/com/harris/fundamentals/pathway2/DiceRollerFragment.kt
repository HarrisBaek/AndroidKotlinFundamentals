package com.harris.fundamentals.pathway2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.harris.fundamentals.R
import com.harris.fundamentals.databinding.FragmentDiceRollerBinding
import com.harris.fundamentals.databinding.FragmentFirstPathwayBinding

class DiceRollerFragment : Fragment() {
    private var _binding: FragmentDiceRollerBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDiceRollerBinding.inflate(inflater, container, false)

        binding.diceBtn.setOnClickListener {
            rollDice()
        }

        return binding.root
    }

    private fun rollDice() {
        val drawableResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImage.setImageResource(drawableResource)




    }


}