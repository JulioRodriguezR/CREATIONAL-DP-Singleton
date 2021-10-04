package org.formacion.singleton;

public class SingleObject {
	
	//create an object of SingleObject
	private static SingleObject INSTANCE = new SingleObject();

	//make the constructor private so that this class cannot be
	//instantiated
	private SingleObject(){}

	//Get the only object available
	public static SingleObject getInstance(){
		return INSTANCE;
	}

	public void showMessage(){
	    System.out.println("Hello World!");
	}
}
