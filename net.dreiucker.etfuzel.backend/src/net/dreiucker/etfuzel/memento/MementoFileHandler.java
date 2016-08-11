package net.dreiucker.etfuzel.memento;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MementoFileHandler {

	public MementoList loadMementos() {
		
		return null;
	}
	
	public void saveMementos(MementoList mementos) {
		try {
			JAXBContext context = JAXBContext.newInstance(MementoList.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			marshaller.marshal(mementos, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
