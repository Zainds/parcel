package com.example.myapplicationa

import android.content.Context
import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


   class Excercise(
    var name: String? = null,
    var imbDownLimit: Float? = null ,
    var imbLimit: Float? = null
): Parcelable {
    constructor(source: Parcel) : this(
        source.readString(),
        source.readFloat(),
        source.readFloat()
    )

    override fun writeToParcel(dest: Parcel?, flags: Int): Unit = with(dest) {
        this?.writeString(name)
        this?.writeValue(imbDownLimit)
        this?.writeValue(imbLimit)
    }

    override fun toString(): String {
        return "$name"
    }

    override fun describeContents(): Int {
        return 0
    }
    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Excercise> = object : Parcelable.Creator<Excercise> {
            override fun createFromParcel(parcel: Parcel): Excercise {
                return Excercise(parcel)
            }

            override fun newArray(size: Int): Array<Excercise?> {
                return arrayOfNulls(size)
            }
        }
    }
}


