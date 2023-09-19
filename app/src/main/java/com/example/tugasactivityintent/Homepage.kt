package com.example.tugasactivityintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasactivityintent.databinding.ActivityHomepageBinding

private lateinit var binding: ActivityHomepageBinding
class Homepage : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone1 = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        val welcomeMessage = "Welcome $username"
        val emails = "Your $email has been activated"
        val telp = "Your $phone1 has been registered"
        with(binding) {
            user3.text = username
            email3.text = email
            phone.text = phone1
        }
    }
}