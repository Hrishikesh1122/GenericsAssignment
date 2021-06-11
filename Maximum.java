/**********************************************************
 * Purpose : Learn the use of Generics
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 11-06-2021
 *
 **********************************************************/
package com.hrishikesh.GenericsTestProjects;
public class Maximum {
	
	/**
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return Maximum of 3 Integers
	 */
	public  Integer maxInt(Integer num1 ,Integer num2 , Integer num3) {
		Integer max=num1;
		if(num2.compareTo(max)>0)
			max=num2;
		if(num3.compareTo(max)>0)
			max=num3;
		return max;	
	}

	public static void main(String[] args) {
		Maximum m = new Maximum();
		System.out.println(m.maxInt(-3,55,8));

	}

}
