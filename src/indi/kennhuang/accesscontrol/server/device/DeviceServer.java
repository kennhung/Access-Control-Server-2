package indi.kennhuang.accesscontrol.server.device;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DeviceServer implements Runnable {

    private static ServerSocket server = null;
    private static boolean shutdown = false;

    @Override
    public void run() {
        ExecutorService threadExecutor = Executors.newCachedThreadPool();
        try {
            System.out.println("Device Server Starting on Port 6083");
            server = new ServerSocket(6083);
            while (!shutdown) {
                Socket socket = server.accept();
                threadExecutor.execute(new DeviceServerHandler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (threadExecutor != null)
                threadExecutor.shutdown();
            if (server != null)
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}
