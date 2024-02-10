package com.capgemini.sample

import android.content.Context
import androidx.lifecycle.LiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class FinancialDataRepository(val ctx:Context) {

    val finDao = FinancialDataDatabase.getInstance(ctx).finaceDao()

    suspend fun addData(
        type: String,
        amount: Double,
        category: String,
        description: String,
        date: String
    ): Boolean {

        var isAdded = false


        try {

            finDao.addData(FinancialData(type, amount, category, description, date))
            isAdded = true

        } catch (err: Exception) {

            isAdded = false

        }



        return isAdded

    }
}
