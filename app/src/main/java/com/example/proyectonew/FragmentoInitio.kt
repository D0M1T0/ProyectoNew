package com.example.proyectonew

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.proyectonew.databinding.FragmentFragmentoInitioBinding

class fragmentoInitio : Fragment(), View.OnClickListener {

    private var _binding: FragmentFragmentoInitioBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFragmentoInitioBinding.inflate(inflater,
            container, false)
        binding.btnpre.setOnClickListener(this)
        return binding.root
    }

    override fun onClick(p0: View?) {
        Toast.makeText(requireContext(), binding.etnombre.text.toString(),
            Toast.LENGTH_LONG).show()
    }

}