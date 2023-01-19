package com.example.park
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.park.ParkData
import com.example.park.ParkDetail
import kotlinx.android.synthetic.main.view.view.*

class Adapter(var park: List<ParkData>) : RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var title = view.title
        var parkimg = view.park_img
        var region = view.region
        var distance = view.distance

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context, ParkDetail::class.java)
            intent.putExtra("park",park[position])
            intent.putExtra("parkImage",dummyImage)
            holder.itemView.context.startActivity(intent)

        }
        holder.title.text = park[position].title
        holder.region.text = park[position].region
        holder.distance.text = park[position].distance + "km"


        when (park[position].title!!.toLowerCase()) {
            "bayanaul" -> {
                dummyImage = R.drawable.ic_bayan
                holder.parkimg.setImageResource(dummyImage!!)
            }
            "katon" -> {
                dummyImage = R.drawable.ic_katon
                holder.parkimg.setImageResource(dummyImage!!)
            }
            "charynsky" -> {
                dummyImage = R.drawable.ic_charynsky
                holder.parkimg.setImageResource(dummyImage!!)
            }
            "burabai" -> {
                dummyImage = R.drawable.ic_burabay
                holder.parkimg.setImageResource(dummyImage!!)
            }
            "kolsay" -> {
                dummyImage = R.drawable.ic_kolsay
                holder.parkimg.setImageResource(dummyImage!!)
            }
            "karkaraly" -> {
                dummyImage = R.drawable.ic_karkar
                holder.parkimg.setImageResource(dummyImage!!)
            }
            "ilealatau" -> {
                dummyImage = R.drawable.ic_alatau
                holder.parkimg.setImageResource(dummyImage!!)
            }
            "altynemel" -> {
                dummyImage = R.drawable.ic_altyn
                holder.parkimg.setImageResource(dummyImage!!)
            }
        }




    }

    override fun getItemCount(): Int {
        return park.size
    }
}

