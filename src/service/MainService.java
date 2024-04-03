package service;

import datastr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		try {
			myList.add(23);
			myList.add(100);
			myList.add(100);
			myList.add(100);
			myList.add(-5);
			myList.add(10, 2);
			myList.print();
			myList.delete(3);
			myList.print();
			System.out.println(myList.search(100));
			System.out.println(myList.get(4));
//			myList.makeEmpty();
//			myList.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
