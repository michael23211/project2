package fuctionLibrary;

import java.io.File;

public class FilePaths {

    public static String configFilePath = new File("src/main/resources/testData/config.properties").getAbsolutePath();
    public static String reportXmlFilepath = new File("src/main/resources/extent-config.xml").getAbsolutePath();
}
