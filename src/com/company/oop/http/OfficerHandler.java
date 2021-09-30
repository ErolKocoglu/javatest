package com.company.oop.http;

import com.company.oop.people.Officer;
import com.company.oop.people.StudentNew;
import com.google.gson.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class OfficerHandler implements HttpHandler {
    ArrayList<Officer> officerArrayList = new ArrayList<>();

    @Override
    public void handle(HttpExchange t) throws IOException {
        InputStream body = t.getRequestBody();
        String text = new String(body.readAllBytes(), StandardCharsets.UTF_8);

        Gson gson = new Gson();
        JsonObject jsonObject = new JsonParser().parse(text).getAsJsonObject();
        JsonArray officerArray = jsonObject.getAsJsonArray("officers");
        Officer officers = gson.fromJson(text, Officer.class);

        String response = "<div style=\"margin: auto; border:1px solid purple; width:600px; height:800px; padding: 65px;\">\n" +
                "    <h1> Get students</h1>\n" +
                "    <p> Here is the list of students</p>\n" +
                "    <ul>\n" +
                "      <li style='color:orange;'>" + printOfficers(officerArray.get(0)) + "</li>\n" +
                "      <li style='color:red;'>" + printOfficers(officerArray.get(1)) + "</li>\n" +
                "</ul>\n" +
                "</div>\n";
        System.out.println("Officer");
        t.sendResponseHeaders(200, 0);
        OutputStream os = t.getResponseBody();
        os.write(response.getBytes());
        os.close();
        t.close();
    }

    public String printOfficers(JsonElement jsonElement) {
        String name = jsonElement.getAsJsonObject().get("name").getAsString();
        String surname = jsonElement.getAsJsonObject().get("surname").getAsString();
        String birthdate = jsonElement.getAsJsonObject().get("birthdate").getAsString();
        String birthPlace = jsonElement.getAsJsonObject().get("birthPlace").getAsString();
        String orgName = jsonElement.getAsJsonObject().get("orgName").getAsString();
        String orgAddress = jsonElement.getAsJsonObject().get("orgAddress").getAsString();
        int age = jsonElement.getAsJsonObject().get("age").getAsInt();
        long id = jsonElement.getAsJsonObject().get("id").getAsLong();

        return name + " " + surname + " " + birthdate + " " + birthPlace + " " + orgName + " " + orgAddress + " " + age + " " + id;
    }
}
