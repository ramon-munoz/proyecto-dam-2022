package com.ramonmunoz.unionviera.feature_notes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ramonmunoz.unionviera.ui.theme.*

@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
){
    companion object{
        val  noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
