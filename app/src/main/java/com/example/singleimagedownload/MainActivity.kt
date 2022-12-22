package com.example.singleimagedownload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.singleimagedownload.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load("https://pl-coding.com/wp-content/uploads/2022/04/pic-squared.jpg")
            .into(binding.imageView)
        binding.downloadImgBtn.setOnClickListener {
            val downloader = AndroidDownloader(this)
            downloader.downloadFile("https://pl-coding.com/wp-content/uploads/2022/04/pic-squared.jpg")
        }
        /*val downloader = AndroidDownloader(this)
        downloader.downloadFile("https://pl-coding.com/wp-content/uploads/2022/04/pic-squared.jpg")*/
    }
}