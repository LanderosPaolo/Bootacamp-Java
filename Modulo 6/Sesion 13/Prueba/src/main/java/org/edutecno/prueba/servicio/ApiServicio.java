package org.edutecno.prueba.servicio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.edutecno.prueba.modelo.Post;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApiServicio {

    public List<Post> obtenerPosts() {
        List<Post> posts = new ArrayList<>();
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();
            posts = new Gson().fromJson(content.toString(), new TypeToken<List<Post>>(){}.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return posts;
    }
}
