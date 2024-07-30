package com.example.ecartapp.database

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseHelper(context: Context) : SQLiteOpenHelper(
    context,
    Constants.DATABASE_NAME,
    null,
    Constants.DATABASE_VERSION
) {
    override fun onCreate(db: SQLiteDatabase?) {
        val createTableQuery = """
                  CREATE TABLE ${Constants.TABLE_NAME} (
                         ${Constants.COLUMN_ID} INTEGER PRIMARY KEY AUTOINCREMENT,
                         ${Constants.COLUMN_NAME} TEXT,
                         ${Constants.COLUMN_PASSWORD} TEXT)
        """.trimMargin()

        db?.execSQL(createTableQuery)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    fun readData(): List<User> {
        val datalist = mutableListOf<User>()

        val curser: Cursor = readableDatabase.query(
            Constants.TABLE_NAME,
            null,
            null,
            null,
            null,
            null,
            null,
        )

        with(curser) {
            while (moveToNext()) {
                val id = getInt(getColumnIndexOrThrow(Constants.COLUMN_ID))
                val name = getString(getColumnIndexOrThrow(Constants.COLUMN_NAME))
                val password = getString(getColumnIndexOrThrow(Constants.COLUMN_PASSWORD))
                datalist.add(User(id, name,password)) // add ID later
            }

        }
        return datalist
    }

    fun insertData(username: String,password : String): Long {

        val values = ContentValues().apply {
            put(Constants.COLUMN_NAME, username)
            put(Constants.COLUMN_PASSWORD, password)
        }

        return writableDatabase.insert(Constants.TABLE_NAME, null, values)
    }


    fun checkCredentials(username: String, password: String): Boolean {

        val db = this.readableDatabase

        val selection = "${Constants.COLUMN_NAME} = ? AND ${Constants.COLUMN_PASSWORD} = ?"
        val selectionArgs = arrayOf(username, password)

        val cursor = db.query(
            Constants.TABLE_NAME,
            null,
            selection,
            selectionArgs,
            null,
            null,
            null
        )

        val count = cursor.count
        cursor.close()
        this.close()

        return count > 0
    }


    /* fun update(id: Long,name: String,description : String) : Int{
         val values = ContentValues().apply {
             put(Constants.COLUMN_NAME, name)
             put(Constants.COLUMN_DESCRIPTION, description)

         }
         val selection = "${Constants.COLUMN_ID} = ?"
         val selectionArgs = arrayOf(id.toString())
         return writableDatabase.update(Constants.TABLE_NAME,values, selection, selectionArgs)
     }

     fun delete(id: Long) : Int{
         val selection = "${Constants.COLUMN_ID} = ?"
         val selectionArgs = arrayOf(id.toString())
         return writableDatabase.delete(Constants.TABLE_NAME,selection,selectionArgs)
     }*/
}