package au.edu.unimelb.wheresdanny.find_mentor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import au.edu.unimelb.wheresdanny.R
import au.edu.unimelb.wheresdanny.data.User

class MentorAdapter(private val listt: List<User>, val navController: NavController) :
    RecyclerView.Adapter<MentorAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName = itemView.findViewById<TextView>(R.id.txtName)
        var txtCurrentTitle = itemView.findViewById<TextView>(R.id.txtCurrentTitle)
        var txtHashtags = itemView.findViewById<TextView>(R.id.txtHashtags)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater =
            LayoutInflater.from(parent.context).inflate(R.layout.row_mentor, parent, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = listt[position]
        holder.txtName.text = current.name
        holder.txtHashtags.text = current.hashtags
        holder.txtCurrentTitle.text = current.currentJobTitle
        holder.itemView.setOnClickListener {
            navController.navigate(MentorsListFragmentDirections.viewProfile(current.email))
        }
    }

    override fun getItemCount(): Int {
        return listt.size
    }

}