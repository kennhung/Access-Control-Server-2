package indi.kennhuang.accesscontrol.server.web;

import com.sun.net.httpserver.HttpServer;
import indi.kennhuang.accesscontrol.server.web.handlers.Index;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebServer implements Runnable {

    private static HttpServer httpServer = null;
    private static boolean shutdown = false;

    public void startHttpServer() throws IOException {
        System.out.println("Web Server Starting on Port 8000");
        httpServer = HttpServer.create(new InetSocketAddress(8000), 0);
        httpServer.createContext("/res", new StaticFileServer());
        httpServer.createContext("/", new Index());
        httpServer.setExecutor(null);
        httpServer.start();
    }

    @Override
    public void run() {
        try {
            this.startHttpServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}