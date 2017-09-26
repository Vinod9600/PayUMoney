/*
package taskmanagement.vinod.com.payukickstarter.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import taskmanagement.vinod.com.taskmanagement.bean.TaskItem;

*/
/**
 * Created by Vinod on 8/3/2017.
 *//*


public class DatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "taskManager";

    // Contacts table name
    private static final String TABLE_TASK = "tasks";

    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "taskName";
    private static final String KEY_DESCRIPTION = "taskDescription";
    private static final String KEY_ISUPDATEONSERVER = "isUpdateOnServer";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_TASK + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_DESCRIPTION + " TEXT,"
                + KEY_ISUPDATEONSERVER + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TASK);

        // Create tables again
        onCreate(db);
    }

    // Adding new contact
    public void addTask(TaskItem taskItem) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, taskItem.getTaskName()); // task Name
        values.put(KEY_DESCRIPTION, taskItem.getTaskDescription()); // task Description
        values.put(KEY_ISUPDATEONSERVER, taskItem.isUpdatedOnServer());

        // Inserting Row
        db.insert(TABLE_TASK, null, values);
        db.close(); // Closing database connection
    }

    // Getting single contact
    public TaskItem getTask(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_TASK, new String[] { KEY_ID,
                        KEY_NAME, KEY_DESCRIPTION }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        TaskItem taskItem = new TaskItem(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2),Integer.parseInt(cursor.getString(3)));
        // return task
        return taskItem;

    }

    // Getting All Contacts
    public List<TaskItem> getAllTasks() {
        List<TaskItem> taskList = new ArrayList<TaskItem>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_TASK;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                TaskItem taskItem = new TaskItem();
                taskItem.setId(Integer.parseInt(cursor.getString(0)));
                taskItem.setTaskName(cursor.getString(1));
                taskItem.setTaskDescription(cursor.getString(2));
                taskItem.setUpdatedOnServer(Integer.parseInt(cursor.getString(3)));
                // Adding contact to list
                taskList.add(taskItem);
            } while (cursor.moveToNext());
        }

        // return contact list
        return taskList;
    }

    // Getting contacts Count
    public int getTaskCount() {
        String countQuery = "SELECT  * FROM " + TABLE_TASK;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
}
*/
