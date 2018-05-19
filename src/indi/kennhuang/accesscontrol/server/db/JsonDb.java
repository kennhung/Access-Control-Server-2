package indi.kennhuang.accesscontrol.server.db;

import indi.kennhuang.accesscontrol.server.AccessControlMain;
import indi.kennhuang.accesscontrol.server.db.instance.GroupInstance;
import indi.kennhuang.accesscontrol.server.db.instance.UserInstance;
import io.jsondb.JsonDBTemplate;
import io.jsondb.crypto.DefaultAESCBCCipher;
import io.jsondb.crypto.ICipher;

public class JsonDb {
    static String dbFilesLocation = "database";
    static String baseScanPackage = "indi.kennhuang.accesscontrol.server.db.instance";

    static JsonDBTemplate userDbTemplate;
    static JsonDBTemplate groupDbTemplate;

    public static void initDb(){
        userDbTemplate  = new JsonDBTemplate(dbFilesLocation, baseScanPackage);
        groupDbTemplate = new JsonDBTemplate(dbFilesLocation, baseScanPackage);

        try {
            userDbTemplate.createCollection(UserInstance.class);
        }
        catch (Exception e){
            if(!e.getMessage().contains("already exists")) {
                e.printStackTrace();
            }
        }
        try {
            groupDbTemplate.createCollection(GroupInstance.class);
        }
        catch (Exception e){
            if(!e.getMessage().contains("already exists")) {
                e.printStackTrace();
            }
        }

    }
}
