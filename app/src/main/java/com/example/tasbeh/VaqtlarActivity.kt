package com.example.tasbeh

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tasbeh.databinding.ActivityVaqtlarBinding

class VaqtlarActivity : AppCompatActivity() {
    private val binding by lazy { ActivityVaqtlarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.vaqtlar.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://namozvaqti.uz/shahar/fargona")
            startActivity(intent)
        }

    }
}