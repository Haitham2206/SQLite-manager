package k.haitham.sqlitemanager.database;

import k.haitham.sqlitemanager.database.model.Details;
import k.haitham.sqlitemanager.database.model.commands.Commands;

/**
 * This class show you how to insert data to database
 */
public class SaveToDB {

    public SaveToDB() {
        Commands commands = new Commands();
        Details details = new Details();
        details.setDayTime("DUMMY");
        details.setActivityType("DUMMY");
        details.setConfidence("DUMMY");
        commands.insert(details);

    }
}
