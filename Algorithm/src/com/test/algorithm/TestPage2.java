package com.test.algorithm;

import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class TestPage2 {
 
    public static void main(String[] args) throws IOException {
 
      
    	 Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
             //컴페얼 메서드도 기억이 안나고 가물가물하냐 ㅆ끼발 
    		 @Override
             public int compare(Integer o1, Integer o2) {
                 if (Math.abs(o1) > Math.abs(o2) || (Math.abs(o1) == Math.abs(o2) && o1 > o2)) return 1;
                 else return -1;
             }
         });
    
    	
    	
 
    }
 
}