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
			System.out.println(myList.find(100));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}

}
