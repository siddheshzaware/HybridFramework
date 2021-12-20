package com.els.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configdataprovider {
	
	Properties pr;
	
	public Configdataprovider()
	{
		File St=new File("./Configuration/config.properties");

		try {
			FileInputStream Frs = new FileInputStream(St);
			pr=new Properties();
			pr.load(Frs);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print("Unable to load fiel"+e.getMessage());
			
		}
			
	}

	public String getBrowser()
	{
        System.out.println("HII");
		return pr.getProperty("Url");

	}
	
	public String getUrl()
	{
		return pr.getProperty("Url");
	}
	
}
