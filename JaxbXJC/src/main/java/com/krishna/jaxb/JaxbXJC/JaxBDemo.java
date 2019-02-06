package com.krishna.jaxb.JaxbXJC;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.krishna.patient.Patient;
 
public class JaxBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			JAXBContext context = JAXBContext.newInstance(Patient.class);
			Marshaller marsheller = context.createMarshaller();
			
			
			Patient patient = new Patient();
			patient.setId(123);
			patient.setName("krish");
			StringWriter writer = new StringWriter();
			
			marsheller.marshal(patient, writer);
			System.out.println(writer.toString());
			
			
		Unmarshaller unMarshaller=  context.createUnmarshaller();
		
		
		Patient patientReader = (Patient)unMarshaller.unmarshal(new StringReader(writer.toString()));
		
		System.out.println(patientReader.getName());
			
			
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		

	}

}
