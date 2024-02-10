package com.capgemini.sample

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface FinancialDataDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addData(pson:FinancialData)

}