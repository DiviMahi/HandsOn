package com.dv.marshalling;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class App1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Emp.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			FileReader fr = new FileReader("target/Emp.xml");
			Object object = unmarshaller.unmarshal(fr);
			System.out.println(object);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
