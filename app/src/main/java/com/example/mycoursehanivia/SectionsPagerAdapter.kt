package com.example.mycoursehanivia

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 3 // 3 Tab: Home, Materi, Quiz

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> MateriFragment()
            2 -> QuizFragment()
            else -> HomeFragment()
        }
    }
}