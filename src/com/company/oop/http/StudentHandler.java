package com.company.oop.http;

import com.company.oop.people.StudentNew;
import com.google.gson.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class StudentHandler implements HttpHandler {
    ArrayList<StudentNew> studentNewArrayList = new ArrayList<>();

    public StudentHandler() {
        System.out.println();
    }

    @Override
    public void handle(HttpExchange t) throws IOException {
        InputStream body = t.getRequestBody();
        String text = new String(body.readAllBytes(), StandardCharsets.UTF_8);

        Gson gson = new Gson();


        JsonObject jsonObject = new JsonParser().parse(text).getAsJsonObject();
        JsonArray studentArray = jsonObject.getAsJsonArray("students");
        StudentNew students = gson.fromJson(text, StudentNew.class);
        studentNewArrayList.add(students);

        if (t.getRequestMethod().equals("GET")) {
            String response = "<div style=\"margin: auto; border:1px solid purple; width:600px; height:800px; padding: 65px;\">\n" +
                    "    <h1> Get students</h1>\n" +
                    "    <p> Here is the list of students</p>\n" +
                    "    <ul>\n" +
                    //listStudents(studentArray) +
                    "      <li style='color:orange;'>" + printStudents(studentArray.get(0)) + "</li>\n" +
                    "      <li style='color:red;'>" + printStudents(studentArray.get(1)) + "</li>\n" +
                    "</ul>\n" +
                    "</div>\n";

            System.out.println("Student");
            t.sendResponseHeaders(200, 0);
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        } else if (t.getRequestMethod().equals("DELETE")) {
            System.out.println("Deleting student");
        } else if (t.getRequestMethod().equals("POST")) {

        }


        t.close();
    }

    public String printStudents(JsonElement jsonElement) {
        String name = jsonElement.getAsJsonObject().get("name").getAsString();
        String surname = jsonElement.getAsJsonObject().get("surname").getAsString();
        String birthdate = jsonElement.getAsJsonObject().get("birthdate").getAsString();
        String birthPlace = jsonElement.getAsJsonObject().get("birthPlace").getAsString();
        long id = jsonElement.getAsJsonObject().get("id").getAsLong();
        double averagePoint = jsonElement.getAsJsonObject().get("averagePoint").getAsDouble();
        String clazz = jsonElement.getAsJsonObject().get("class").getAsString();
        return name + " " + surname + " " + birthdate + " " + birthPlace + " " + id + " " + averagePoint + " " + clazz;
    }

    public String listStudents(JsonArray jsonArray) {
        String listElements = "";
        for (int i = 0; i < jsonArray.size(); i++) {
            listElements.concat("      <li style='color:orange;'>" + printStudents(jsonArray.get(i)) + "</li>\n");
        }
        return listElements;
    }
}
