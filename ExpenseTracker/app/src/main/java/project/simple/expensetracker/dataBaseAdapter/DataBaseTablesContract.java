package project.simple.expensetracker.dataBaseAdapter;

import android.provider.BaseColumns;

/**
 * Created by laptop on 1/28/18.
 */

public class DataBaseTablesContract {

    private DataBaseTablesContract () {}

    public static class DataBaseTables implements BaseColumns {

        //Database Expenses Table name
        public static final String TABLE_NAME_EXPENSES = "Expenses";

        //Column names for expenses table
        public static final String COLUMN_NAME_ID = "ID";
        public static final String COLUMN_NAME_NAME = "Name";
        public static final String COLUMN_NAME_COST = "Amount";
        public static final String COLUMN_NAME_COMMENT = "Comment";
        public static final String COLUMN_NAME_DATE = "Date";

    }
}
