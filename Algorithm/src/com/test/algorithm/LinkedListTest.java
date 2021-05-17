package com.test.algorithm;

public class LinkedListTest {

	
	private Node head;//머리역할
	private Node tail;//꼬리역할
	private int size;//링크드 리스트의 사이즈를 저장
	
	//노드객체 생성
	private class Node {
		
		private Object data;
		private Node next;
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	
	public Node node(int index) {
		
		Node x = head;
		
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		
		return x;
	}
	
	
	//링크드 리스트 가장 앞에 데이터를 넣어주는것.
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;//원래 처음으로 있던놈을 다음 데이터 포인터로 가리켜 주는것이다.
		head = newNode;
		size++;
		
		if (head.next == null) {
			tail = head;
		}	
	}
	
	//링크드 리스트 가장 마지막에 데이터를 넣어주는것.
	public void addLast(Object input) {
		Node newNode = new Node(input);
		
		if (size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int index,Object input) {
		
		Node newNode = new Node(input);
		
		if (index == 0) {
			addFirst(input);
		} else if (index == size){
			Node temp = node(index-1);
			temp.next = newNode;
			tail = newNode;
			size++;
		} else {
			Node temp1 = node(index-1);
			temp1.next = newNode;
			Node temp2 = node(index);
			newNode.next = temp2;
			size++;
		}
		
	}
 	
	
	

	public static void main(String[] args) {
		LinkedListTest lt = new LinkedListTest();
		lt.addFirst(13);
		lt.addLast(15);
		lt.addLast(153);
		
		lt.add(0, 10203);
		lt.add(3, 1055203);
		lt.add(4, 1210203);
		
		System.out.println(lt.node(0));
		System.out.println(lt.node(1));
		System.out.println(lt.node(2));
		System.out.println(lt.node(3));
		System.out.println(lt.node(4));
		
	}

	
	
}
