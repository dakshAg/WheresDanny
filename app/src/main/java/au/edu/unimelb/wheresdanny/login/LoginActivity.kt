package au.edu.unimelb.wheresdanny.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import au.edu.unimelb.wheresdanny.R
import au.edu.unimelb.wheresdanny.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSignIn.setOnClickListener {
            val email = binding.inputEmail.text.toString()
            val password = binding.inputPassword.text.toString()


        }
    }
}