package ru.pinevpple.walletcontrol.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expense_table")
class ExpenseTable(
    @ColumnInfo(name = "amount") val amount: Int,
    @ColumnInfo(name = "date") val date: String
) {

    @PrimaryKey(autoGenerate = true)
    private var id: Int = 0

    fun getId(): Int = id
    fun setId(id: Int) {
        this.id = id
    }
}