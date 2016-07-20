
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
		
}