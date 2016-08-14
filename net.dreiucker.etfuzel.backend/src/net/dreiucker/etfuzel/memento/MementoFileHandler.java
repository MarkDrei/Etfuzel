package net.dreiucker.etfuzel.memento;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MementoFileHandler {
	
	public final static String DEFAULT_FILE_NAME = "./bin/etfuzelData.xml";

	public MementoList loadMementos() {
		File file = new File(DEFAULT_FILE_NAME);
		if (file.exists() && file.canRead()) {
			JAXBContext context;
			try {
				context = JAXBContext.newInstance(MementoList.class);
				Unmarshaller unmarshaller = context.createUnmarshaller();
				Object data = unmarshaller.unmarshal(file);
				
				// TODO remove
				System.out.println("Data loaded from " + file.getAbsolutePath());
				
				if (data instanceof MementoList) {
					return (MementoList) data;
				}
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//TODO remove
		System.out.println("Generating default content");
		
		MementoList list = new MementoList();
		Memento memento = new Memento("the title");
		MementoText text = new MementoText();
		text.setText("This is the text for the memento");
		memento.setParts(text);
		memento.setParts(text);
		list.add(memento);
		return list;
	}
	
	public void saveMementos(MementoList mementos) {
		try {
			JAXBContext context = JAXBContext.newInstance(MementoList.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			
			marshaller.marshal(mementos, new File(DEFAULT_FILE_NAME));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
