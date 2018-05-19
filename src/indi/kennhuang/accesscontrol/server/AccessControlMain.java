package indi.kennhuang.accesscontrol.server;

import indi.kennhuang.accesscontrol.server.db.JsonDb;
import indi.kennhuang.accesscontrol.server.device.DeviceServer;
import indi.kennhuang.accesscontrol.server.web.WebServer;

import java.net.URL;
import java.sql.SQLException;

public class AccessControlMain {
    static DeviceServer deviceserver = new DeviceServer();
    static WebServer webServer = new WebServer();
    public static void main(String[] Args) throws SQLException, InterruptedException {
        new Thread(deviceserver).start();
        JsonDb.initDb();
        new Thread(webServer).start();
    }
}
