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

Decision uiToolbar {
	Issue: "Decide on place where to put common functionality such as save, load..."
	Status: decided
	Solution: "Have a toolbar for this" reasoning "well why not"
	
	Requirements: ReqUI_100 
}

Decision MementoList {
	Issue: "Mementos need to be displayed in a list. Decide on concrete user interface"
	Status: decided
	Solution: "Use a table which functions as a list"
		reasoning '
			The table widget allows to list the mementos in rows where they can easily be selected
			The table widget also allows to plan for future requirements, such as sorting, more details 
			in additional colunms and so on.'
	Requirements: ReqUI_02
}

Decision MementoView {
	Issue: "The contents of a memento must be displayed"
	Status: decided
	Solution: "Display the individual contents of a memento in a view with tabs"
		reasoning '
			Mementos can have multiple different kinds of contents.
			Provide individual views for each kind, and offer them as tabs.
			Tabs are just fine since the expected number of contents is low, most often only
			1 content type will be used, and typically less then 3 content types are used per
			Memento'
	Requirements: { 
		ReqUI_03
		ReqHL_Memento_01
		ReqHL_Memento_02
		}
	
}













