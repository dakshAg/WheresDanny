package au.edu.unimelb.wheresdanny.jobs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import au.edu.unimelb.wheresdanny.R
import au.edu.unimelb.wheresdanny.data.User

class JobAdapter(private val listt: List<Job>, val navController: NavController) :
    RecyclerView.Adapter<JobAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName = itemView.findViewById<TextView>(R.id.txtName)
        var txtCurrentTitle = itemView.findViewById<TextView>(R.id.txtCurrentTitle)
        var txtHashtags = itemView.findViewById<TextView>(R.id.txtHashtags)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater =
            LayoutInflater.from(parent.context).inflate(R.layout.row_job, parent, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val current = listt[position]
        holder.txtName.text = current.company
        holder.txtHashtags.text = current.description
        holder.txtCurrentTitle.text = current.title
    }

    override fun getItemCount(): Int {
        return listt.size
    }

}