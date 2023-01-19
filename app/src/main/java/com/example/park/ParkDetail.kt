package com.example.park

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import com.bumptech.glide.Glide
import com.example.park.ParkData
import com.example.park.R
import kotlinx.android.synthetic.main.activity_park_detail.*
import kotlinx.android.synthetic.main.activity_park_detail.*
import kotlinx.android.synthetic.main.view.*

class ParkDetail : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var obj: ParkData
    private var parkImg: Int? = null
    private lateinit var mainParkImg: ImageView
    private var isSliderRunning = false
    private val handler = Handler()
    private var runnable: Runnable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_detail)
        button = findViewById(R.id.shareButton)
        val url = "https://github.com/DanielLeBonific"

        mainParkImg = findViewById(R.id.mainImage)

        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra("Share this", url)
            val chooser = Intent.createChooser(intent, "Share using...")
            startActivity(chooser)
        }
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        obj = intent.getParcelableExtra("park")!!
        parkImg = intent.getIntExtra("parkImage", -1)
        setData(obj, parkImg!!)
        obj.id?.let { sliderRun(it) }
        park_img_info.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            intent.putExtra("lat", obj.latitude)
            intent.putExtra("long", obj.longitude)
            startActivity(intent)
        }
    }

    private fun loadImage(image: Int) {
        Glide.with(this).load(image).into(mainParkImg)
    }

    private fun setData(obj:ParkData,parkImg:Int) {
        title_info.text=obj.title
        distance_info.text=obj.distance+"km"
        overview_info.text=obj.overview
        region_info.text=obj.region
        park_img_info.setImageResource(parkImg)
    }

    fun sliderRun(number: Int) {
        if (isSliderRunning) {
            runnable?.let { handler.removeCallbacks(it) }
        }
        var currentImage = 0
        var images = intArrayOf()
        val runnable = object : Runnable {
            override fun run() {
                when (number) {
                    1 -> images = intArrayOf(R.drawable.bg_bayan1, R.drawable.bg_bayan2, R.drawable.bg_bayan3)
                    2 -> images = intArrayOf(R.drawable.bg_burabai1, R.drawable.bg_burabai2, R.drawable.bg_burabai3)
                    3 -> images = intArrayOf(R.drawable.bg_katon1, R.drawable.bg_katon2, R.drawable.bg_katon3)
                    4 -> images = intArrayOf(R.drawable.bg_charynski1, R.drawable.bg_charynski2, R.drawable.bg_charynski3)
                    5 -> images = intArrayOf(R.drawable.bg_kolsay1, R.drawable.bg_kolsay2, R.drawable.bg_kolsay3)
                    6 -> images = intArrayOf(R.drawable.bg_ile1, R.drawable.bg_ile2jpg, R.drawable.bg_ile3)
                    7 -> images = intArrayOf(R.drawable.bg_altyn1, R.drawable.bg_altyn2, R.drawable.bg_altyn2)
                    8 -> images = intArrayOf(R.drawable.bg_karkar1, R.drawable.bg_karkar2, R.drawable.bg_karkar3)

                }
                currentImage++
                if (currentImage > images.size - 1) {
                    currentImage = 0
                }
                loadImage(images[currentImage])
                handler.postDelayed(this, 3000)
            }
        }
        isSliderRunning = true
        handler.postDelayed(runnable, 3000)


    }




}


