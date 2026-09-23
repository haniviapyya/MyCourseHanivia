package com.example.mycoursehanivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mycoursehanivia.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

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

        // Klik tombol OOP -> Pindah ke tab Materi (Index 1)
        binding.btnOop.setOnClickListener {
            (activity as? MainActivity)?.let { mainAct ->
                mainAct.findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.view_pager).currentItem = 1
            }
        }

        // Klik tombol Android -> Pindah ke tab Materi (Index 1)
        binding.btnAndroid.setOnClickListener {
            (activity as? MainActivity)?.let { mainAct ->
                mainAct.findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.view_pager).currentItem = 1
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}