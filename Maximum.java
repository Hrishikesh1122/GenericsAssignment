/**********************************************************
 * Purpose : Learn the use of Generics
 * @author Hrishikesh Ugavekar
 * @Version 1.1
 * @since 11-06-2021
 *
 **********************************************************/
package com.hrishikesh.GenericsTestProjects;

import java.util.ArrayList;
import java.util.Collections;


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
	
	/**
	 * UC4 : Taking more then 3 arguments n sorting them
	 * @param <H>
	 * @param arrayList
	 */
	public <H extends Comparable<H>> void maxInArrayList (ArrayList<H> arrayList) {
		Collections.sort(arrayList);
		for(H temp:arrayList)
			System.out.println(temp);
	}


	public static void main(String[] args) {
		Maximum m = new Maximum();
		System.out.println(m.maxOfAnything(20.55,55.8,8.8));
		System.out.println(m.maxOfAnything(200,55,8));
		System.out.println(m.maxOfAnything("A","B","C"));
		
		MyGenericClass<Integer> myclass = new MyGenericClass<>(1,2,3);
		Integer trial1 = myclass.maxOfAnything(myclass.getVariable1(), myclass.getVariable2(), myclass.getVariable3());
		System.out.println(trial1);
		
		MyGenericClass<String> myclass1 = new MyGenericClass<>("Apple","Banana","Peru");
		String trial2 = myclass1.maxOfAnything(myclass1.getVariable1(), myclass1.getVariable2(), myclass1.getVariable3());
		System.out.println(trial2);
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);arrayList.add(8);arrayList.add(25);arrayList.add(1);
		m.maxInArrayList(arrayList);
		
		
	}

}
