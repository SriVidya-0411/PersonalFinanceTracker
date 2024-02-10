package com.capgemini.sample

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FinancialData(val type:String,
                         val amount: Double,
                         val category: String,
                         val description: String,
                         @PrimaryKey val date: String
)