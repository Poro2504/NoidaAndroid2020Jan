package com.puldroid.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_blank.*

class BlankFragment : Fragment() {

    val list = arrayListOf("Iron Man","Thor","Doctor Strange","Marvel","Hulk")
     val adapter = MovieAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?  = inflater.inflate(R.layout.fragment_blank, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter.swapData(list)
        moviesRv.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@BlankFragment.adapter
        }
        button.setOnClickListener {
            Toast.makeText(requireContext(),"Simple Toast",Toast.LENGTH_LONG).show()
        }
    }

}
