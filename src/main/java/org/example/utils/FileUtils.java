package org.example.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Slf4j
public class FileUtils {

    public static String readXmlToString(String path) {
        String xmlString = "";
        try {
            // Read the entire content of the file into a string
            xmlString = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);

            // Output the XML string to the console (optional)
            log.info(xmlString);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlString;
    }
}
