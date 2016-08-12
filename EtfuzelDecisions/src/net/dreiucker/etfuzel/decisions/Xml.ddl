
Decision storageToXmlFiles {
	Issue: "Data needs to be stored somewhere"
	Status: decided
	Solution: "Store the data in XML files"
		reasoning
			'Easy to implement and debug, as we can observe and modify the contents in any text editor'
	Alternatives: {
		"Plain text files" reasoning "Implementation more difficult"
		
		"Binary text files" 
			causes { 
				"Easy to implement by serializing to Object Output/Input Streams"
				"Not human readable"
				"Difficult to maintain when the data model changes (old files cannot be read any more)"
			}
			reasoning "The human readability of XML is considered very important"
		
		"Object oriented database" reasoning "Not thoroughly considered due to missing experience"
	}
	Requirements: ReqHL_Storage_01 
}

Decision xmlTechnology {
	Issue: "Data needs to be converted from and to XML"
	Status: decided
	Solution: "Use JAXB to serialize and de-serialize data to and from XML"
		causes 
			'Data Model and XML annotations are interleaved, thus somewhat violating the 
			separation of concern principle'
		reasoning 
			'JAXB is well supported specification supported by multiple different implementations'
	Related: storageToXmlFiles
}

Decision xmlParts {
	Issue: 
		'Mementos can contain multiple parts, such as a texts, pictures, a due date... That list is not complete.
		How can we model this in our data model, so that this can be stored?'
	
	Status: decided
	Solution: 
		'The Memento gets a list of "parts". Those "parts" are represented by an abstract base class.
		(note: an interface would be more appropriate, but this is not supported by JAXB)
		
		In the Memento, the @XmlElementRef annotation will be used so that the (un-)marshaller can resolve this.
		Additionally the abstract base class of the parts needs to use @XmlSeeAlso so that the ancestor classes are found.
		'
		
	Alternatives: {
		'Use the concrete types directly, i.e. have one list of texts, one list of due dates...'
		reasoning 'More difficult to extend and a big number of useless (?) getter and setter methods.'
	}
	
	Requirements: ReqHL_Memento_02
}