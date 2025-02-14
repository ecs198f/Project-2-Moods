package com.android.example.moods

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.android.example.moods.data.Note
import kotlinx.android.synthetic.main.noteslist_item.view.*

class NoteListAdapter(private var mNoteList: List<Note>): RecyclerView.Adapter<NoteListAdapter.NoteViewHolder>() {

    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {
        // TODO PHASE 1.1: Define Views in ViewHolder
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.noteslist_item, parent, false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        // TODO PHASE 1.1: Update views in layout with Note data from the current
        //  Note ine the list based on the given position


        // TODO PHASE 1.1: Add a click listener on the container view of one notelist_item and
        //  use the Navigation Controller to switch to the ViewNoteFragment Screen. Make sure to
        //  pass the clicked Note as an argument
    }

    override fun getItemCount(): Int = mNoteList.size

    // Update the recycler view list with new data passed in
    fun setData(newNotes: List<Note>) {
        this.mNoteList = newNotes
        notifyDataSetChanged()
    }

    // This method may be useful for setting mood images in the ViewHolder
    private fun setMoodImage(view: ImageView, mood: String) {
        when (mood) {
            "anxious" -> view.setImageResource(R.drawable.ic_anxious_outline_false)
            "content" -> view.setImageResource(R.drawable.ic_content_outline_false)
            "happy" -> view.setImageResource(R.drawable.ic_happy_outline_false)
            "mad" -> view.setImageResource(R.drawable.ic_mad_outline_false)
            "neutral" -> view.setImageResource(R.drawable.ic_neutral_outline_false)
            "sad" -> view.setImageResource(R.drawable.ic_sad_outline_false)
            else -> { // Note the block
                view.setImageResource(R.drawable.ic_empty_state)
            }
        }
    }
}
