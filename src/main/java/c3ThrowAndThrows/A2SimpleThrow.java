package c3ThrowAndThrows;

import java.io.IOException;

// IOException directly comes under Exception

public class A2SimpleThrow {

//	public void methodB() throws Exception {
//	public void methodB() throws IOException, Exception {
	public void methodB() throws IOException {
		System.out.println("throw exception");
		throw new IOException();
	}
	
	public static void main(String[] args) throws  Exception {
//	public static void main(String[] args) throws IOException, Exception {
		A1ThrowsDemo obj = new A1ThrowsDemo();
		obj.methodB();
	}
}
