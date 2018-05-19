package indi.kennhuang.accesscontrol.server.db;

import indi.kennhuang.accesscontrol.server.db.instance.UserInstance;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    public static UserInstance findUserById(int id){
        String jxQuery = String.format("/.[id='%d']", id);

    }
}
