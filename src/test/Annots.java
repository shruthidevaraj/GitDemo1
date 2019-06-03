package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Annots {
	
	@Test
	public void login() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Shruthi Devaraj\\eclipse-workspace\\1\\TestNG_Tutorial\\src\\test\\datadriven.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
	}

}
