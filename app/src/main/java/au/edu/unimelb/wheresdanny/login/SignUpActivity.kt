package au.edu.unimelb.wheresdanny.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import au.edu.unimelb.wheresdanny.R
import au.edu.unimelb.wheresdanny.databinding.ActivityLoginBinding
import au.edu.unimelb.wheresdanny.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSignIn.setOnClickListener {
            val email = binding.inputEmail.text.toString()
            val password = binding.inputPassword.text.toString()
            val passwordConfirm = binding.inputConfirmPassword.text.toString()

            if (password != passwordConfirm) {
                binding.inputConfirmPassword.error = "Passwords Don't Match"
            }
        }
    }
}