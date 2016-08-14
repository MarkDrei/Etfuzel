
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

Decision dataModelSeparation {
	Issue: "How and where to structure data design."
	Status: decided
	Solution: "Implement the data model in a separate Eclipse project"
		extends ModelViewController
		reasoning '
			- Separation of concerns
			- Technically trivial to ensure correct dependencies'
}

