package com.example.park

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import com.example.park.ParkData
import com.example.park.R
import kotlinx.android.synthetic.main.activity_park_detail.*
import kotlinx.android.synthetic.main.activity_park_detail.*
import kotlinx.android.synthetic.main.view.*

class ParkDetail : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var obj: ParkData
    private var parkImg:Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_park_detail)
        button = findViewById(R.id.shareButton)
        val url = "https://github.com/DanielLeBonific"
        button.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra("Share this", url)
            val chooser = Intent.createChooser(intent,"Share using...")
            startActivity(chooser)
        }
        window.decorView.apply { systemUiVisibility=
            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }



        obj= intent.getParcelableExtra("park")!!
        parkImg=intent.getIntExtra("parkImage",-1)
        setData(obj, parkImg!!)
    }
    private fun setData(obj:ParkData,parkImg:Int)
    {
        title_info.text=obj.title
        distance_info.text=obj.distance+"km"
        overview_info.text=obj.overview
        region_info.text=obj.region
        park_img_info.setImageResource(parkImg)


    }
}

