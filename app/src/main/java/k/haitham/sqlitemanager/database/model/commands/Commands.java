package k.haitham.sqlitemanager.database.model.commands;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import k.haitham.sqlitemanager.database.data.DatabaseManager;
import k.haitham.sqlitemanager.database.model.Details;


public class Commands {
    public static String createTable() {
        return "CREATE TABLE " + Details.TABLE + "(  "
                + Details.KEY_ActivityRecognitionId + " INTEGER PRIMARY KEY AUTOINCREMENT ,   "
                + Details.KEY_DayTime + " TEXT, "
                + Details.KEY_ActivityType + " TEXT     ,   "
                + Details.KEY_Confidence + " TEXT)";
    }

    public int insert(Details details) {
        int activityRecognitionId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();

        values.put(Details.KEY_DayTime, details.getDayTime());
        values.put(Details.KEY_ActivityType, details.getActivityType());
        values.put(Details.KEY_Confidence, details.getConfidence());


        activityRecognitionId = (int) db.insert(Details.TABLE, null, values);
        DatabaseManager.getInstance().closeDatabase();

        return activityRecognitionId;
    }


}
