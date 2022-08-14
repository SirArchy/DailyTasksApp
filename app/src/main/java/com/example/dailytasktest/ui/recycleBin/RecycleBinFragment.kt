package com.example.dailytasktest.ui.recycleBin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dailytasktest.databinding.FragmentRecyclebinBinding

class RecycleBinFragment : Fragment() {

    private var _binding: FragmentRecyclebinBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val recycleBinViewModel =
            ViewModelProvider(this).get(RecycleBinViewModel::class.java)

        _binding = FragmentRecyclebinBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textRecycleBin
        recycleBinViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}