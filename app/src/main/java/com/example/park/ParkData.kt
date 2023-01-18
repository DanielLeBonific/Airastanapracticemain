package com.example.park

import android.os.Parcel
import android.os.Parcelable

data class ParkData(
    val id:Int?,
    val title:String?,
    val region:String?,
    val distance:String?,
    val overview:String?
):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(region)
        parcel.writeString(distance)
        parcel.writeString(overview)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ParkData> {
        override fun createFromParcel(parcel: Parcel): ParkData {
            return ParkData(parcel)
        }

        override fun newArray(size: Int): Array<ParkData?> {
            return arrayOfNulls(size)
        }
    }

}
