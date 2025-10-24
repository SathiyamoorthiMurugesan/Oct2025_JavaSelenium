package testPractice_Java;

//ClassName should be starts with Caps
//If a ClassName and filename both are same, then we can create only public, default (implicit), abstract and final class.
//If we use other access modifiers (private, default (explicit)), we will encounter an error like 'illegal modifier'


//If we are creating a public class, then it should be in it's own file. (Ex: Test_A1_CreatingClasses should be in Test_A1_CreatingClasses.java file)
// In public class, we can create nested classes using all the access modifiers except default (explicit). If we used default, will get syntax error


public class Test_A1_CreatingClasses {
	
	public class T1_NestedClass {
		
	}
	private class T2_NestedClass {
		
	}
	protected class T3_NestedClass {
	
	}
	class T4_NestedClass{
		
	}
}

