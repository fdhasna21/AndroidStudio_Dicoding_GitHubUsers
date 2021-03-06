package com.fdhasna21.githubusers.resolver.dataclass

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchUsers(
    @SerializedName("total_count") val total:Int?,
    @SerializedName("incomplete_results") val results:String?,
    @SerializedName("items") val users : ArrayList<User>?
) : Parcelable
