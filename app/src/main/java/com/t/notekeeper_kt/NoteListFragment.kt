package com.t.notekeeper_kt

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.t.notekeeper_kt.databinding.FragmentNoteListBinding
import kotlinx.android.synthetic.main.fragment_note_list.*


/**
 * A simple [Fragment] subclass.
 */
class NoteListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentNoteListBinding>(
            inflater,
            R.layout.fragment_note_list,
            container,
            false
        )
        binding.fab.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_noteListFragment_to_FirstFragment)
            Log.i("NoteList Fragment", "fab button click")
            println("button clicked")
        }
        listNotes.adapter = activity?.let {
            ArrayAdapter(
                it,
                android.R.layout.simple_list_item_1,
                DataManager.notes
            )
        }

        return binding.root
    }
}