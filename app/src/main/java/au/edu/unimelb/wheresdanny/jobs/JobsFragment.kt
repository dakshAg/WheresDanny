package au.edu.unimelb.wheresdanny.jobs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import au.edu.unimelb.wheresdanny.R
import au.edu.unimelb.wheresdanny.databinding.FragmentJobsBinding
import au.edu.unimelb.wheresdanny.databinding.FragmentProfileBinding

class JobsFragment : Fragment() {
    private lateinit var binding: FragmentJobsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentJobsBinding.inflate(inflater, container, false);
        return binding.root
    }
}