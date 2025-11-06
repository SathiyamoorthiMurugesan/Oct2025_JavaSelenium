package testPractice_Java;

/*
 *  Immutable - Can't clear/change
 *  SCP - String Constant Pool- Part of Heap Memory
 * 
 * We will create String using methods:
 * 1. String literals
 * 2. String Objects
 * 
 * Immutable concept is happens only with String literals.
 * Original value doesn't change. only new object will be created. thats why we are calling string as immutable
 * 
 * String str = "Sathya";
 * Here str (variable name) is stored in stack memory and "Sathya" (variable value) is stored in SCP of heap memory
 * If we are perform any manipulations on String literals, the old value is not get replaced.
 * 
 * String str = "Welcome";
 * String str1 = "Welcome";
 * String str2 = "Java";
 * 
 * Stack     SCP
 * str       Welcome
 * str1
 * str2      Java
 * 
 * In the above example, both str and str1 are pointing out Welcome.
 * if we perform, str1 = str1+"abc";  str1 is updated as Welcomeabc and stored in SCP
 * 
 * Stack     SCP
 * str       Welcome
 * str1      Welcomeabc
 * str2      Java
 * 
 * now str = str+str2; then 
 * 
 * Stack     SCP
 * str       WelcomeJava   (Welcome is now left alone in SCP)
 * str1      Welcomeabc
 * str2      Java
 * 
* Now the "Welcome" in SCP is not assigned to any variable in stack. 
* "welcome" - String object is not used by anyone;
* Here value of str is not replaced as 'WelcomeJava'. It will create new object in SCP to store the value welcome java. now both welcome and welcomeJava will be avilable in SCP.
* =====================================================
* Unused objects in java is cleared by Garbage collector.
* ======================================================
* Any how it will not get deleted in code. It's just get wiped out in Memory location
* We can use it whenever we want in code 
* 
*
*Why immutable concept not happens with String Object?
*Because object will be stored in Heap memory
*String str = new Sting("Hello");   str will be stored in stack memory and new String("Hello") will be stored in heap memeory.
*/

public class Test_B10_StringImmutable {

	public static void main(String[] args) {

	}

}
