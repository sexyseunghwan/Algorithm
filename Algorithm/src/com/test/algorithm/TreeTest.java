package com.test.algorithm;

public class TreeTest {

	public static void main(String[] args) {
		
//		int[] a = new int[10];
//		
//		for (int i = 0; i < a.length; i++) {
//			a[i] = i;
//		}
//		
//		Tree t = new Tree();
//		t.makeTree(a);
//		System.out.println(t);
//		t.searchBTree(t.root, 9);
		
		StaticTest t1 = new StaticTest();
		t1.applestore = 1;
		System.out.println(t1.applestore);
		
		//이게 상당히 static 은 안쓰는게 좋다고 알려져있음
		
	}
}

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data) {//생성자 생성
		this.data = data; 
	}
	
}

class Tree {
	
	Node root;
	
	public void makeTree(int[] a) {
		root = makeTreeR(a,0,a.length -1);
	}
	
	public Node makeTreeR(int[] a, int start, int end) {//재귀호출 -> 이쪽부분이 이해가 잘 안가는곳임..
		if (start > end) return null;
		int mid = (start + end) / 2;
		Node node = new Node(a[mid]);
		node.left = makeTreeR(a,start,mid-1);
		node.right = makeTreeR(a,mid+1,end);
		return node;
	}
	
	
	public void searchBTree (Node n, int find) {
		
		if (find < n.data) {
			System.out.println("Data is Smaller than " + n.data);
			searchBTree(n.left, find);
			
		} else if (find > n.data) {
			System.out.println("Data is bigger than " + n.data);
			searchBTree(n.right, find);
			
		} else {
			System.out.println("Data found!");
		}
		
		//이해자체가 안가는데?!..
		
	}

}