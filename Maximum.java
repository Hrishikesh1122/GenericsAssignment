/**********************************************************
 * Purpose : Learn the use of Generics
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 11-06-2021
 *
 **********************************************************/
package com.hrishikesh.GenericsTestProjects;
public class Maximum  {
	
	/**
	 * @param element 1
	 * @param element 2
	 * @param element 3
	 * @return Maximum of 3 of any Type
	 */
	public  <E extends Comparable<E>> E maxOfAnything(E element1 ,E element2 , E element3) {
		E max=element1;
		if(element2.compareTo(max)>0)
			max=element2;
		if(element3.compareTo(max)>0)
			max=element3;
		return max;	
	}


	public static void main(String[] args) {
		Maximum m = new Maximum();
		System.out.println(m.maxOfAnything(20.55,55.8,8.8));
		System.out.println(m.maxOfAnything(200,55,8));
		System.out.println(m.maxOfAnything("A","B","C"));
	}

}
