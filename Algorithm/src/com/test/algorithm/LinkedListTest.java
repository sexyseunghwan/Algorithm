package com.test.algorithm;

public class LinkedListTest {

	private Node head;
	private Node tail;
	private int size;
	
	//링크드 리스트는 객체와 객체를 연결해서(***) 만드는것이다.
	private class Node {
		private Object data;
		private Node next;//누가 다음 노드인가?
		
		public Node(Object input) {//생성자
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
		
	}//Node
	
	
	private void addFirst(Object input) {
		
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		
		if (head.next == null) {//혼자 있다는거지
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		
		Node newNode = new Node(input);
		
		if (size == 0) {//데이터가 존재하고 있지 않을 경우
			addFirst(input);
		} else {//데이터가 존재하는 경우
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	Node node(int index) {
		//head를 먼저 찾아가야 한다.
		Node x = head;
		
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		
		return x;
	}
	
	//원하는곳에 input 해주고 싶은 경우
	public void add(int k, Object input) {
		
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			
			if (newNode.next == null) {
				tail = newNode;
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		LinkedListTest numbers = new LinkedListTest();
		
		numbers.addFirst(30);
		//numbers.toString();
		numbers.addFirst(20);
		
		numbers.addFirst(10);
		numbers.add(2,15);
		
		System.out.println(numbers.node(1));
		
		//numbers.addFirst(10);
		
	}



	
	
}
