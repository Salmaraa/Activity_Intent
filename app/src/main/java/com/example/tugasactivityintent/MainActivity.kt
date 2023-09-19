package com.example.tugasactivityintent

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.tugasactivityintent.databinding.ActivityHomepageBinding
import com.example.tugasactivityintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivityLifecycle"
    private lateinit var binding: ActivityMainBinding
    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_PASSWORD = "extra_password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: dipanggil")

        with(binding) {
            btnregis.setOnClickListener {
                val intent =
                    Intent(this@MainActivity, Homepage::class.java)
                intent.putExtra(EXTRA_USERNAME, user.text.toString())
                intent.putExtra(EXTRA_EMAIL , mail.text.toString())
                intent.putExtra(EXTRA_PHONE , hp.text.toString())
                intent.putExtra(EXTRA_PASSWORD, password.text.toString())
                startActivity(intent)
            }

            log.setOnClickListener{
                val intent = Intent(this@MainActivity, Loginpage::class.java)
                startActivity(intent)
            }
        }
    }
}
