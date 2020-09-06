package com.test.algorithm;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
 
public class TestPage2 {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // reader writer 생성
 
        String input = br.readLine();
        // 라인 읽어서
 
        String[] arr = input.split(" ");
 
        int count = Integer.parseInt(arr[0]);
        // 총 갯수와
        int term = Integer.parseInt(arr[1]);
        // 텀 세팅
 
        Queue<Integer> queue = new LinkedList<Integer>();
        // 큐 linkedlist로 구현
 
        for (int i = 1; i <= count; i++) {
            queue.offer(i);
        }
        // 1부터 count 까지 큐에 추가
 
        StringBuilder sb = new StringBuilder("<");
        // 스트링 빌더 생성
 
        while (!queue.isEmpty()) {
            // queue가 빌때까지
 
            for (int j = 1; j <= term; j++) {
                // term 만큼 반복하는데
 
                if (j != term) {
                    // 마지막이 아닐때는
                    queue.offer(queue.poll());
                    // 맨 앞에 있는 걸 맨 뒤로 돌리고
 
                } else {
                    // 마지막 일 때는
                    sb.append(queue.poll());
                    // 가장 처음 숫자를 지우면서 sb에 추가
                    sb.append(", ");
                    // 쉼표 찍어주고
                }
            }
 
        }
 
        String temp = sb.substring(0, sb.length() - 2);
        // 쉼표 듸어쓰기 제거
        sb = new StringBuilder(temp);
 
        sb.append(">");
        // 괄호 닫아주고
 
        bw.write(sb.toString());
        // 출력
        
        br.close();
        bw.flush();
        bw.close();
        // reader와 writer를 닫는다
 
    }
 
}