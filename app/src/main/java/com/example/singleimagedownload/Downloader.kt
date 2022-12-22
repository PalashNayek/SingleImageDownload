package com.example.singleimagedownload

interface Downloader {
    fun downloadFile(url: String): Long
}