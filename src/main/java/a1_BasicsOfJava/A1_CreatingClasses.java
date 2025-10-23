package a1_BasicsOfJava;

// AccessModifier class(keyword) ClassName {
// What is file name and what is className- difference you should know.

// When the file name and class name is same,
//	* we can only create class using public and without mentioning default (implicit)
//  * only public, default(implicit), abstract and final are allowed.


// If you want to create a public class, the class should be created in its own file
//	* means, we can create default(implicit) class in other class files

// In public class, you can create nested classes using all the access modifiers except default (explicit)


public class A1_CreatingClasses {

	public class ClassA {

	}

	private class ClassB {

	}

	protected class ClassC {

	}

//	default class ClassD {
//
//	}

	class ClassE {

	}

}

//class A1_CreatingClasses {
//
//}

class A1_CreatingClasses_new1 {

}

//private class A1_CreatingClasses_new2 {
//
//}

// NOT POSSIBLE TO CREATE 
//private class A1_CreatingClasses {
//
//}

//protected class A1_CreatingClasses {
//
//}

//default class A1_CreatingClasses {
//
//}
