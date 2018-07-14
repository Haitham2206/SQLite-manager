package k.haitham.sqlitemanager.database.app;

/**
 * Created by Haitham-PC on 12/25/2017.
 */

import android.app.Application;
import android.content.Context;

import k.haitham.sqlitemanager.database.data.DBHelper;
import k.haitham.sqlitemanager.database.data.DatabaseManager;


public class App extends Application {
    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
        DBHelper dbHelper = new DBHelper();
        DatabaseManager.initializeInstance(dbHelper);

    }
}
