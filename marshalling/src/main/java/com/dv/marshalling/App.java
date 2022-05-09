package com.dv.marshalling;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Emp emp = new Emp(1, "Divya", "CEO", "divimahi07");
		Address address = new Address("3/539A", "sowdeswari colony", "Periya puthur", 641697, "India");
		emp.setAd(address);
		try {
			JAXBContext context = JAXBContext.newInstance(Emp.class);
			Marshaller marshaller = context.createMarshaller();
			FileWriter fw = new FileWriter("Emp.xml");

			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(emp, System.out);
			marshaller.marshal(emp, fw);

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
