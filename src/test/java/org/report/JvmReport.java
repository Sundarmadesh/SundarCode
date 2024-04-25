package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void reportjvm(String jsonpath) {

		File f = new File("F:\\Automation Testing\\Clonefolder\\SundarCode\\Reports\\JVM");
		
		Configuration c = new Configuration(f, "blazedemobooking");
		
		c.addClassifications("Platform", "Windows");
		c.addClassifications("OS", "Windows 10");
		
		List<String> l = new ArrayList<String>();
		l.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();
		
		
		
		
		
		
}

}
