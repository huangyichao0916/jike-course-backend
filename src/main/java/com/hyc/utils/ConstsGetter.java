package com.hyc.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.Properties;

public class ConstsGetter {
    static private Properties consts;

    public static String getConsts(String constName) {
        return consts.getProperty(constName);
    }

    static {
        consts = new Properties();
        String filename = "consts.properties";
        String path = ConstsGetter.class.getClassLoader().getResource(filename).getPath();
        try {
            FileInputStream fis = new FileInputStream(path);
            consts.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
