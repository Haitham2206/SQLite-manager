package k.haitham.sqlitemanager.database.data;

/*
  Created by Haitham-PC on 12/25/2017.
 */

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import k.haitham.sqlitemanager.database.app.App;
import k.haitham.sqlitemanager.database.model.Details;
import k.haitham.sqlitemanager.database.model.commands.Commands;

public class DBHelper extends SQLiteOpenHelper {

    // we need to change the version number each time we make a change to a table
    private static final int DATABASE_VERSION = 1;
    private static final String TAG = DBHelper.class.getSimpleName();
    private static String DATABASE_NAME = "DB_NAME";


    public DBHelper() {

        super(App.getContext(), DATABASE_NAME, null, DATABASE_VERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create tables
        db.execSQL(Commands.createTable());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Sending a DEBUG log message.
        Log.d(TAG, String.format("SQLiteDatabase.onUpgrade(%d -> %d)", oldVersion, newVersion));
        //Drop table if exists
        db.execSQL("DROP TABLE IF EXISTS " + Details.TABLE);
    }
}
