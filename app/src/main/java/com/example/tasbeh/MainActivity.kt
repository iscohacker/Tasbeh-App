package com.example.tasbeh

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tasbeh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val mediaPlayer = MediaPlayer.create(this, R.raw.tasbehs)
        val mediaPlayer1 = MediaPlayer.create(this, R.raw.spin)
        MySharedPrefereces.init(this)
        binding.count.text = MySharedPrefereces.count.toString()

        binding.btnCount.setOnClickListener {
            mediaPlayer.start()
            var i = MySharedPrefereces.count
            i++
            binding.count.text = i.toString()
            MySharedPrefereces.count = i
            binding.tasbeh.animate().rotationBy(15f).setDuration(300).start()
        }
        binding.reset.setOnClickListener {
            mediaPlayer1.start()
            var i = MySharedPrefereces.count
            i = 0
            binding.count.text = i.toString()
            MySharedPrefereces.count = i
            binding.tasbeh.animate().rotationBy(360f).setDuration(1000).start()
        }
        binding.namozTime.setOnClickListener {
            val intent = Intent(this, VaqtlarActivity::class.java)
            startActivity(intent)
        }
    }
}