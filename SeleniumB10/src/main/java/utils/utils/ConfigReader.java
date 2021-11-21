package utils.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static String readProperty(String key) {//it wil look for key in configurartion properti and wil take value
        //File class assign given file to the java object.
        File file= new File("configuration.properties");//should be the same as a name of file on config.properties
        //file class assign given file to the java object
        Properties properties= new Properties();//it is going to read the file

        try{
            properties.load(new FileReader(file));
            //load method will load every value from file object to properties object.
        } catch(IOException e){
            e.printStackTrace();
        }
        return properties.getProperty("");//I can read the va;ue from properties object using the key
        //We are not using trows bc we will need declare trows everytime when we are calling the method

    }
}
