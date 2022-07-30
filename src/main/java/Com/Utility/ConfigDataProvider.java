package Com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	public ConfigDataProvider() throws Exception {
		String pathconfig="C:\\Users\\TJIN\\eclipse-workspace\\Hello World\\Batch_11_Framework\\Config\\Config.Properties";
		FileInputStream file=new FileInputStream(pathconfig);
		
		pro=new Properties();
		pro.load(file);
		
	}
	
	public String getBaseurl_QA1() {
		return pro.getProperty("Baseurl_QA1");
	}
	
	public String getBaseurl_QA2() {
		return pro.getProperty("Baseurl_QA2()");
	}

}
