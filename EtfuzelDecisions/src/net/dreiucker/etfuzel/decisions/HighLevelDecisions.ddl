
Decision maven {
	Issue: "How to manage build and testing"
	Status: decided
	Solution: maven reasoning '
		- Engineer wants to learn maven
		- Maven is the de facto standard in java based projects
		'
	
	Alternatives: { 
		sbt reasoning 
			'Also interesting, but probably more difficult to support this on github (this is a guess)'
		
		"Plain Eclipse builds" reasoning 
			'The SWT dependency would refer to a local jar archive and not be portable'
		}
		
}

Decision programmingLanguage {
	Issue: "Decide on the program language to use"
	Status: decided
	Solution: LanguageJava reasoning 
		'All available engineers are familiar with Java'
		
	Owner: boss
	
	Alternatives: {
		LanguageJavaScript 
		LanguageCpp reasoning 'No one knows C++ here'
	}
}

Decision storageToFiles {
	Issue: "Data needs to be stored somewhere"
	Status: decided
	Solution: "Store the data in simple files"
		reasoning
			'Easy to implement and debug, as we can observe and modify the contents in any text editor'
}

Decision dataModelLogicallySeparated {
	Issue: "How and where to structure data design."
	Status: decided
	Solution: "Implement the data model in a separate Eclipse project"
		extends ModelViewController
		reasoning '
			- Separation of concerns
			- Technically trivial to ensure correct dependencies'
}

Decision windowToolkitSWT {
	Issue: "Choose a window toolkit for displaying the GUI elements"
	Status: decided
	Solution: "Use SWT as a window toolkit" 
		causes {
			"Additional testing overhead: SWT might behave slightly differently on each platform"
			"Native UI look and feel on all supported platforms"
			}
		reasoning
			'Favor UI performance and native look and feel of the end product'
		
	Owner: dilbert
	
	Alternatives: {
		windowToolkitAWT: "Use AWT" causes "Limited choice of widgets available"
		windowToolkitSwing: "Use Swing" causes "Same typical Java UI look on all platforms"
	}
	
	Requirements: ReqUI_01

	
}