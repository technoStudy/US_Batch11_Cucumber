package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
  // ConfigReader class used in Java applications to read properties from configuration file

   private static Properties properties = new Properties();
   // static initializing block
   static {
       try {
           // Configuration file path
           String filePath = "src/test/resources/config.properties";
           // to find file path right-click on the config.properties file and take content root
           // to read data from the file
           FileInputStream fileInputStream = new FileInputStream(filePath);
           properties = new Properties();
           properties.load(fileInputStream);// loads the file content into Properties object
       }catch (FileNotFoundException e){
           System.out.println(e.getMessage());
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
   }

   public static String getProperty(String key){

       return properties.getProperty(key);
   }

}
