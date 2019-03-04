package application.app.com.dbflow_test1.daoEntity;

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = DataBase.NAME, version = DataBase.VERSION)
public class DataBase {
    public static final String NAME = "dbflow_test";

    public static final int VERSION = 1;
}
