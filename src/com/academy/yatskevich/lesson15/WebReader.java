package com.academy.yatskevich.lesson15;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class WebReader implements Runnable {
    static int counter = 1;
    String webAddress;
    public WebReader(String webAddress) {
        this.webAddress = webAddress;
    }

    @Override
    public void run() {

        String path = "D:/";
        String fileName = null;
        fileName = String.format("out" + counter++ + ".txt");
        String fullPath = path + fileName;

        URL url = null;
        try {
            url = new URL(webAddress);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
             DataOutputStream doc = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fullPath)))) {

            String line;
            while ((line = reader.readLine()) != null) {
                doc.write(line.getBytes(StandardCharsets.UTF_8));
                doc.write('\n');
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
