package project.simple.expensetracker.dataBaseAdapter;

import android.provider.BaseColumns;

/**
 * Created by laptop on 1/28/18.
 */

public class EntryDatabasesContract {

    private EntryDatabasesContract(){}

    public static class BillsEntry implements BaseColumns {
        public static final String TABLE_NAME = "Bills";
        public static final String COLUMN_NAME_ENTRYNAME = "name";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COMMENT = "comment";
    }

    public static class HouseholdEntry implements BaseColumns {
        public static final String TABLE_NAME = "Household";
        public static final String COLUMN_NAME_ENTRYNAME = "name";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COMMENT = "comment";
    }

    public static class ClothesEntry implements BaseColumns {
        public static final String TABLE_NAME = "Bills";
        public static final String COLUMN_NAME_ENTRYNAME = "name";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COMMENT = "comment";
    }

    public static class TransportEntry implements BaseColumns {
        public static final String TABLE_NAME = "Transport";
        public static final String COLUMN_NAME_ENTRYNAME = "name";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COMMENT = "comment";
    }

    public static class FoodEntry implements BaseColumns {
        public static final String TABLE_NAME = "Food";
        public static final String COLUMN_NAME_ENTRYNAME = "name";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COMMENT = "comment";
    }

    public static class FreeTimeEntry implements BaseColumns {
        public static final String TABLE_NAME = "FreeTime";
        public static final String COLUMN_NAME_ENTRYNAME = "name";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COMMENT = "comment";
    }

    public static class MiscellaneousEntry implements BaseColumns {
        public static final String TABLE_NAME = "Miscellaneous";
        public static final String COLUMN_NAME_ENTRYNAME = "name";
        public static final String COLUMN_NAME_AMOUNT = "amount";
        public static final String COLUMN_NAME_COMMENT = "comment";
    }


}
