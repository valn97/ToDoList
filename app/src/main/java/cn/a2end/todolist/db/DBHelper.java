package cn.a2end.todolist.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class DBHelper extends SQLiteOpenHelper {
    //表的结构 id 内容 时间 是否已完成
    public static final String CREATE_DB="create table List ("
            +"id integer primary key autoincrement,"
            +"time text,"
            +"data text,"
            +"isCompleted integer,"
            +"isNotification integer)";

    private Context mContext;
    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_DB);
        Toast.makeText(mContext,"初次启动，成功创建数据库",Toast.LENGTH_SHORT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Toast.makeText(mContext,"数据库已更新",Toast.LENGTH_SHORT);
    }
}
