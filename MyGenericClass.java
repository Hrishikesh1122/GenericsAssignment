package com.hrishikesh.GenericsTestProjects;

/**
 * Class which takes 3 generic variables
 * @author Hrishikesh Ugavekar
 * @since 11-06-2021
 * @version 1.0
 * @param <E> 
 */
public class MyGenericClass <E> extends Maximum{
	E variable1;
	E variable2;
	E variable3;
	
	public MyGenericClass(E variable1, E variable2, E variable3) {
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
	}
	
	public E getVariable1() {
		return variable1;
	}
	public void setVariable1(E variable1) {
		this.variable1 = variable1;
	}
	public E getVariable2() {
		return variable2;
	}
	public void setVariable2(E variable2) {
		this.variable2 = variable2;
	}
	public E getVariable3() {
		return variable3;
	}
	public void setVariable3(E variable3) {
		this.variable3 = variable3;
	}

}
