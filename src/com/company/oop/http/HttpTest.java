package com.company.oop.http;

import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;


public class HttpTest {
    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/tourist", new TouristHandler());
        server.createContext("/student", new StudentHandler());
        server.createContext("/officer", new OfficerHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }


}
