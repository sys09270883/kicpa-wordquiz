package com.example.cpa_word_problem

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyFragmentStateAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            1 -> QuizFragment()
            2 -> NoteFragment()
            3 -> SettingFragment()
            else -> HomeFragment()
        }
    }


}