package com.android.example.moods

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.example.moods.data.NoteViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NoteFeedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO PHASE 1.1: Add RecyclerView
        //  you may fill the recyclerview with dummy data to test it out
        //  but you'll want to remove the dummy data when working on Phase 2


        // TODO PHASE 1.1: Add an on click listener to the '+' FAB
        //  and use the Navigation Controller to navigation to the CreateNoteFragment


        // TODO PHASE 2.2: Connect to the NoteViewModel and use it to update the RecyclerView's list
        //  Hint: Look at NoteListAdapter's setData method
    }
}