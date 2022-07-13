package com.harris.fundamentals.pathway3

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.harris.fundamentals.R
import com.harris.fundamentals.databinding.FragmentConstraintBinding

class ConstraintFragment : Fragment() {
    companion object {
        private const val TAG = "Harris:ConstraintFragment"
    }

    private var _binding: FragmentConstraintBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentConstraintBinding.inflate(inflater, container, false)

        binding.pathway3 = this
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }

    fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_text_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_text_two -> view.setBackgroundColor(Color.GRAY)
            R.id.box_text_three -> view.setBackgroundColor(Color.BLUE)
            R.id.box_text_four -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_text_five -> view.setBackgroundColor(Color.BLUE)
            // Boxes using custom colors for background
            R.id.red_btn -> binding.boxTextThree.setBackgroundResource(R.color.my_red)
            R.id.yellow_btn -> binding.boxTextFour.setBackgroundResource(R.color.my_yellow)
            R.id.green_btn -> binding.boxTextFive.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}