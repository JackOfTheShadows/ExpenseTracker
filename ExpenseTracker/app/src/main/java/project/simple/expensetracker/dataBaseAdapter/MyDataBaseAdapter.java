package project.simple.expensetracker.dataBaseAdapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import project.simple.expensetracker.helperClasses.DataBaseEntry;

/**
 * Created by laptop on 1/28/18.
 */

public class MyDataBaseAdapter extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Expenses.db";


    private static final String CREATE_TABLE_EXPENSES =
            "CREATE TABLE " + DataBaseTablesContract.DataBaseTables.TABLE_NAME_EXPENSES + " (" +
                    DataBaseTablesContract.DataBaseTables.COLUMN_NAME_ID + " INTEGER PRIMARY KEY" +
                    " AUTOINCREMENT, " +
                    DataBaseTablesContract.DataBaseTables.COLUMN_NAME_NAME + " TEXT," +
                    DataBaseTablesContract.DataBaseTables.COLUMN_NAME_COMMENT + " TEXT," +
                    DataBaseTablesContract.DataBaseTables.COLUMN_NAME_DATE + " TEXT," +
                    DataBaseTablesContract.DataBaseTables.COLUMN_NAME_COST + " INTEGER)";

    private static final String DELETE_ENTRIES = "DROP TABLE IF EXISTS " +
            DataBaseTablesContract.DataBaseTables.TABLE_NAME_EXPENSES;

    public MyDataBaseAdapter(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE_EXPENSES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL(DELETE_ENTRIES);
        onCreate(sqLiteDatabase);
    }

    public boolean insert(String name, String comment, String date, double cost) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues newEntry = new ContentValues();
        newEntry.put(DataBaseTablesContract.DataBaseTables.COLUMN_NAME_NAME, name);
        newEntry.put(DataBaseTablesContract.DataBaseTables.COLUMN_NAME_COMMENT, comment);
        newEntry.put(DataBaseTablesContract.DataBaseTables.COLUMN_NAME_DATE, date);
        newEntry.put(DataBaseTablesContract.DataBaseTables.COLUMN_NAME_COST, cost);
        long result = db.insert(DataBaseTablesContract.DataBaseTables.TABLE_NAME_EXPENSES,
                null, newEntry);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public List<DataBaseEntry> getEtry() {
        SQLiteDatabase db = this.getReadableDatabase();
        List<DataBaseEntry> myTempList = new ArrayList<DataBaseEntry>();

        String selectQuery = "SELECT * FROM " +
                DataBaseTablesContract.DataBaseTables.TABLE_NAME_EXPENSES;

        Cursor c = db.rawQuery(selectQuery, null);

        if (c.moveToFirst()) {
            do {
                DataBaseEntry dbe = new DataBaseEntry();
                dbe.setName(c.getString(c.getColumnIndex("Name"));
                dbe.setComment(c.getString(c.getColumnIndex("Comment")));
                dbe.setDate(c.getString(c.getColumnIndex("Date")));
                dbe.setCost(c.getDouble(c.getColumnIndex("Cost")));

                myTempList.add(dbe);
            } while (c.moveToNext());
        }
        return myTempList;
    }
}
