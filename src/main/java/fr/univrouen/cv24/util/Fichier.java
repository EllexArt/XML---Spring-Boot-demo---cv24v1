package fr.univrouen.cv24.util;

import org.springframework.core.io.Resource;
import org.springframework.core.io.DefaultResourceLoader;

import java.io.IOException;
import java.nio.charset.Charset;

public class Fichier {
    public static String loadFileXML() {
        Resource resource = new DefaultResourceLoader().getResource("smallCV.xml");
        try {
            return resource.getContentAsString(Charset.defaultCharset());
        } catch (IOException e) {
            return e.getMessage();
        }

    }
}
