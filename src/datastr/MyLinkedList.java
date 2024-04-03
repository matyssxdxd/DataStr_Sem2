package datastr;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyLinkedList<Ttype> {
	private MyListNode first = null;
	private MyListNode last = null;
	private int counter = 0;
	
	//pēc noklusejuma jau ir bezargumenta konstruktors -> MyLinkedList()
	
	public boolean isEmpty()
	{
		return (counter==0);
	}
	
	//TODO padomāt un izveidot isFull() funkciju
	
	public int howManyElements()
	{
		return counter;
	}
	
	public void add(Ttype element) throws Exception {
		if(element == null) throw new Exception("Problems with element");
		
		
		//TODO izsaukt isFull()
		
		if(isEmpty())
		{
			MyListNode newNode = new MyListNode(element);
			first  = newNode;
			last = newNode;
			counter++;
		}
		else
		{
			MyListNode newNode = new MyListNode(element);
			newNode.setPrevious(last);
			last.setNext(newNode);
			last = newNode;
			counter++;
		}
	}

	public void add(Ttype element, int pos) throws Exception {
		if (element == null) throw new Exception("Problems with element");
		if (pos > counter || pos < 0) throw new Exception("Problems with pos");

		if (isEmpty() && pos == 0) {
            add(element);
		} else if (isEmpty() && pos != 0)  {
			throw new Exception("Problems with pos");
		} else if (pos == 0) {
			MyListNode newNode = new MyListNode<>(element);
			newNode.setNext(first);
			first.setPrevious(newNode);
			first = newNode;
			counter++;
		} else if (pos == counter) {
			add(element);
		} else {
			MyListNode temp = first;
			for (int i = 0; i < pos; i++) {
				temp = temp.getNext();
			}
			MyListNode rightNode = temp;
			MyListNode leftNode = temp.getPrevious();
			MyListNode newNode = new MyListNode(element);

			newNode.setNext(rightNode);
			rightNode.setPrevious(newNode);
			newNode.setPrevious(leftNode);
			leftNode.setNext(newNode);

			counter++;

		}
	}

	public void delete(int pos) throws Exception {
		if (isEmpty()) throw new Exception("There are no elements in list");
		if (pos >= counter || pos < 0) throw new Exception("Problems with pos");

		if (pos == 0) {
			first = first.getNext();
			first.setPrevious(null);
			counter--;
			System.gc();
		} else if (pos == counter - 1) {
			last = last.getPrevious();
			last.setNext(null);
			counter--;
			System.gc();
		} else {
			MyListNode temp = first;

			for (int i = 0; i < pos; i++) {
				temp = temp.getNext();
			}

			MyListNode rightNode = temp;
			MyListNode leftNode = temp.getPrevious();

			leftNode.setNext(rightNode.getNext());
			counter--;
			System.gc();
		}
	}

	public ArrayList<Integer> find(Ttype element) throws Exception {
		if (element == null) throw new Exception("Problems with element");

		MyListNode temp = first;
		ArrayList<Integer> result = new ArrayList<>();

		for (int i = 0; i < counter; i++) {
			if (temp.getElement() == element) {
				result.add(i);
			}
			temp = temp.getNext();
		}

		if (result.isEmpty()) throw new Exception("There is no " + element + " in list");

		return result;
	}
	
	public void print() throws Exception
	{
		if(isEmpty()) throw new Exception("List is empty");
		
		
		MyListNode temp = first;
		
		for(int i = 0 ; i < counter; i++) {
			System.out.print(temp + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	
	
	
	
	

}
