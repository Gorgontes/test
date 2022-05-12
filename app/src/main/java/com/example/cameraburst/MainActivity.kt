package com.example.cameraburst

import android.graphics.ImageFormat
import android.hardware.camera2.CameraDevice
import android.media.ImageReader
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.presionarId) as Button
        btn.setOnClickListener {
            println("hello world from this fucking hell!")
        }
        val surfaceView = findViewById<SurfaceView>(R.id.player)
        val imageReader = ImageReader.newInstance(400,400, ImageFormat.RGB_565,1)
        val previewSurfaceView = surfaceView.holder.surface
        val imageReaderSurface = imageReader.surface
        val targets = listOf(previewSurfaceView, imageReaderSurface)
    }
}