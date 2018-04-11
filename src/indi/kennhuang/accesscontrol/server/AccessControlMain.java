package indi.kennhuang.accesscontrol.server;

import indi.kennhuang.accesscontrol.server.db.SQLite;
import indi.kennhuang.accesscontrol.server.device.DeviceServer;
import indi.kennhuang.accesscontrol.server.web.WebServer;

import java.sql.SQLException;
import java.util.Scanner;

public class AccessControlMain {
    static DeviceServer deviceserver = new DeviceServer();
    static WebServer webServer = new WebServer();
    public static void main(String[] Args) throws SQLException, InterruptedException {
        new Thread(deviceserver).start();
        SQLite.openDatabase("jdbc:sqlite:foo.db");
        new Thread(webServer).start();
    }
}
