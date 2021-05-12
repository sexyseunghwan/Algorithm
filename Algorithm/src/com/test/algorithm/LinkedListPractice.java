package com.test.algorithm;

public class LinkedListPractice {
	
	private Node head;//객체 내의 헤드 변수 -> 첫번째로 오는 놈이라고 생각하면 편하다.
	private Node tail;//객체 내의 꼬리 변수 -> 마지막 놈이라고 생각하면 편하다.
	private int size;//객체 내의 사이즈 변수
	
	
	public int getSize() {
		return size;
	}
	
	//노드 객체 생성
	private class Node {
		private Object data;//오브젝트 객체를 넣어주고 있는걸 볼 수 있다.
		private Node next;//객체 내에 다시 자신의 객체를 참조해주고 있다. -> 다음노드를 지목하는 포인터 역할
		
		public Node (Object input) {//생성자
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		
		Node newNode = new Node(input);//새로운 노드객체를 생성해준다.
		newNode.next = head;
		head = newNode;
		size++;
		
		if(head.next == null) {//처음 넣어주는 경우라고 보면 된다.
			tail = head;//이말은 자신이 처음이자 끝이라는 말이라고 보면 된다.
		}
	}
	
	public void addLast(Object input) {
		
		Node newNode = new Node(input);
		
		if(size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	
	public void add(int k, Object input) {
		
		Node newNode = new Node(input);
		
		if (k == 0) {
			addFirst(input);
		} else if (k == size){
			Node temp = node(k-1);
			temp.next = newNode;
			tail = newNode;
			size++;
		} else {
			Node temp = node(k-1);
			Node temp2 = node(k);
			temp.next = newNode;
			newNode.next = temp2;
			size++;
		}
		
		
	}
	
	
	public Node node(int index) {
		Node x = head;
		
		for (int i = 0; i < index; i++) {
			x = x.next;//포인터 역할을 수행한다고 했다.
		}
		
		return x;
	}
	
	
	
	
}
