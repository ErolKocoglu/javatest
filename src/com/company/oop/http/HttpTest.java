package com.company.oop.http;

import com.company.oop.people.Tourist;
import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;


public class HttpTest {
    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/tourist", new TouristHandler());
        server.createContext("/student", new StudentHandler());
        server.createContext("/officer", new OfficerHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
    }

    static class TouristHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            InputStream body = t.getRequestBody();
            String text = new String(body.readAllBytes(), StandardCharsets.UTF_8);

            Gson gson = new Gson();
            Tourist2 tourists = gson.fromJson(text, Tourist2.class);

            if (t.getRequestMethod().equals("DELETE")) {
                System.out.println("Deleting tourist");
            } else if (t.getRequestMethod().equals("GET")) {
                System.out.println("Getting tourist");
            } else if (t.getRequestMethod().equals("POST")) {
                System.out.println("Posting tourist");
            } else {
                t.sendResponseHeaders(405, 0);
            }
            //t.getResponseBody().write("Hello from server".getBytes(StandardCharsets.UTF_8));
            String response = "<div style=\"margin: auto; border:1px solid purple; width:300px; height:200px; padding: 65px;\">\n" +
                    "    <h1> Get tourists</h1>\n" +
                    "    <p> Here is the list of tourists</p>\n" +
                    "    <ul>\n" +
                    "      <li style='color:orange;'>Tourist-1</li>\n" +
                    "      <li style='color:red;'>Tourist-1</li>\n" +
                    "</ul>\n" +
                    "</div>\n";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();

            t.close();
        }
    }

    static class StudentHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            System.out.println("Student");
            t.sendResponseHeaders(200, 0);
            t.close();
        }
    }

    static class OfficerHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            System.out.println("Officer");
            t.sendResponseHeaders(200, 0);
            t.close();
        }
    }

}
