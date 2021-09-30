package com.company.oop.http;

import com.company.oop.people.Tourist;
import com.google.gson.*;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class TouristHandler implements HttpHandler {
    ArrayList<Tourist> touristArrayList=new ArrayList<>();
    @Override
    public void handle(HttpExchange t) throws IOException {
        InputStream body = t.getRequestBody();
        String text = new String(body.readAllBytes(), StandardCharsets.UTF_8);

        Gson gson = new Gson();
        Tourist2 tourists = gson.fromJson(text, Tourist2.class);
        JsonObject jsonObject = new JsonParser().parse(text).getAsJsonObject();
        JsonArray touristArray = jsonObject.getAsJsonArray("tourists");

        if (t.getRequestMethod().equals("DELETE")) {
            System.out.println("Deleting tourist");
        } else if (t.getRequestMethod().equals("GET")) {
            String path=t.getHttpContext().getPath();
            double comingId=Double.parseDouble(path.substring(path.indexOf("tourist") +1));

            for(int i=0; i<touristArray.size();i++){
                if(comingId==touristArray.get(i).getAsJsonObject().get("id").getAsDouble()){
                    String response = "<div style=\"margin: auto; border:1px solid purple; width:300px; height:200px; padding: 65px;\">\n" +
                            "    <h1> Get tourists</h1>\n" +
                            "    <p> Here is the list of tourists</p>\n" +
                            "    <ul>\n" +
                            "      <li style='color:orange;'>" + printTourists(touristArray.get(i)) + "</li>\n" +
                            "</ul>\n" +
                            "</div>\n";
                    t.sendResponseHeaders(200, response.length());
                    OutputStream os = t.getResponseBody();
                    os.write(response.getBytes());
                    os.close();
                    break;
                }
            }

            System.out.println("Getting tourist");
        } else if (t.getRequestMethod().equals("POST")) {
            for(int i=0; i<touristArray.size(); i++){
                String name = touristArray.get(i).getAsJsonObject().get("name").getAsString();
                String surname = touristArray.get(i).getAsJsonObject().get("surname").getAsString();
                String country = touristArray.get(i).getAsJsonObject().get("country").getAsString();
                long id = touristArray.get(i).getAsJsonObject().get("id").getAsLong();

                Tourist tourist=new Tourist(name,surname,country,id);
                touristArrayList.add(tourist);

            }
            System.out.println("Posting tourist");
        } else {
            t.sendResponseHeaders(405, 0);
        }
        //t.getResponseBody().write("Hello from server".getBytes(StandardCharsets.UTF_8));


        t.close();
    }

    public String printTourists(JsonElement jsonElement) {
        String name = jsonElement.getAsJsonObject().get("name").getAsString();
        String surname = jsonElement.getAsJsonObject().get("surname").getAsString();
        String country = jsonElement.getAsJsonObject().get("country").getAsString();
        long id = jsonElement.getAsJsonObject().get("id").getAsLong();

        return name + " " + surname + " " + country + " " + id;
    }
}

