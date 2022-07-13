package com.harris.fundamentals.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.harris.fundamentals.R
import com.harris.fundamentals.databinding.FragmentHomeBinding


class HomeFragment : Fragment(), HomeAdapter.OnItemClickListener {

    companion object {
        private const val TAG = "Harris:HomeFragment"
    }

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = HomeAdapter(createMenus())
        adapter.setOnItemClickListener(this@HomeFragment)
        binding.homeRecycler.adapter = adapter

    }

    private fun createMenus(): List<MenuItem> {
        val menus = arrayListOf<MenuItem>()

        val menuTypedArray = resources.obtainTypedArray(R.array.menus)
        val colorTypedArray = resources.obtainTypedArray(R.array.menu_colors)

        for (i in 0 until menuTypedArray.length()) {
            val menuResId = menuTypedArray.getResourceId(i, -1)
            val color = colorTypedArray.getColor((i % colorTypedArray.length()), -1)
            menus.add(createMenu(menuResId, color))
        }
        menuTypedArray.recycle()
        colorTypedArray.recycle()

        return menus.toList()
    }

    private fun createMenu(menuResId: Int, colorResId: Int): MenuItem {
        val menu = resources.getStringArray(menuResId)
        //Pathway, Title, Desc, Date, Color (Random)
        return MenuItem(menu[0], menu[1], menu[2], menu[3], colorResId)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClick(position: Int) {
        Log.d(TAG, "onItemClick: $position")
        var nextId: Int = -1
        when (position) {
            0 -> nextId = R.id.action_home_to_first
            1 -> nextId = R.id.action_home_to_dice
            2 -> nextId = R.id.action_home_to_constraint
            3 -> nextId = R.id.action_home_to_title
        }
        findNavController().navigate(nextId)
    }
}