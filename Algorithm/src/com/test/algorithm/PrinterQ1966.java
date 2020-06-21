package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class PrinterQ1966 {
	
	/*


	����
	�����е� �˴ٽ��� �������� ������ ���� �������� �μ��ϰ��� �ϴ� ������ �μ� ����� ���� ��������Ρ�, �� ���� ��û�� ���� ���� �μ��Ѵ�. 
	���� ���� ������ ���δٸ� Queue �ڷᱸ���� �׿��� FIFO - First In First Out - �� ���� �μⰡ �ǰ� �ȴ�. ������ ����̴� ���ο� �����ͱ� ���� ����Ʈ��� �����Ͽ��µ�, 
	�� �����ͱ�� ������ ���� ���ǿ� ���� �μ⸦ �ϰ� �ȴ�.

	���� Queue�� ���� �տ� �ִ� ������ ���߿䵵���� Ȯ���Ѵ�.
	������ ������ �� ���� �������� �߿䵵�� ���� ������ �ϳ��� �ִٸ�, 
	�� ������ �μ����� �ʰ� Queue�� ���� �ڿ� ���ġ �Ѵ�. 
	�׷��� �ʴٸ� �ٷ� �μ⸦ �Ѵ�.
	���� ��� Queue�� 4���� ����(A B C D)�� �ְ�, �߿䵵�� 2 1 4 3 ��� C�� �μ��ϰ�, �������� D�� �μ��ϰ� A, B�� �μ��ϰ� �ȴ�.

	�������� �� ����, ���� Queue�� �ִ� ������ ���� �߿䵵�� �־����� ��, � �� ������ �� ��°�� �μ�Ǵ��� �˾Ƴ��� ���̴�. 
	���� ��� ���� ������ C������ 1��°��, A������ 3��°�� �μ�ǰ� �ȴ�.

	�Է�
	ù �ٿ� test case�� ���� �־�����. �� test case�� ���ؼ� ������ �� N(100����)�� �� ��°�� �μ�Ǿ����� �ñ��� ������ ���� Queue�� � ��ġ�� �ִ����� �˷��ִ� M(0�̻� N�̸�)�� �־�����. 
	�����ٿ� N�� ������ �߿䵵�� �־����µ�, �߿䵵�� 1 �̻� 9 �����̴�. �߿䵵�� ���� ������ ���� �� ���� ���� �ִ�. ���� ���� N=4, M=0(A������ �ñ��ϴٸ�), �߿䵵�� 2 1 4 3�� �ȴ�.
	 
	���
	�� test case�� ���� ������ �� ��°�� �μ�Ǵ��� ����Ѵ�.	 
	 
	���� �Է� 1 
	3
	1 0
	5
	4 2
	1 2 3 4
	6 0
	1 1 9 1 1 1
	
	���� ��� 1 
	1
	2
	5		 

	 * 
	 */

	static Queue<Character> queue1; //= new LinkedList<>();//ã����� ������ �� #���� �������ش�.
	static Queue<Integer> queue2; //= new LinkedList<>();//�߿䵵 ������
	static ArrayList<Integer> arr; //= new ArrayList<>();//�߿䵵 �����ϰ����
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			queue1 = new LinkedList<>();
			queue2 = new LinkedList<>();
			arr = new ArrayList<>();
			
			StringTokenizer stk = new StringTokenizer(br.readLine());
			int paper = Integer.parseInt(stk.nextToken());
			int location = Integer.parseInt(stk.nextToken());
			
			for (int j = 0; j < paper; j++) {
				if (j == location) {
					queue1.offer('#');//flag
				} else {
					queue1.offer('*');
				}
			}
			
			String[] input = br.readLine().split(" ");
			
			for (int j = 0; j < paper; j++) {
				queue2.offer(Integer.parseInt(input[j]));
				arr.add(Integer.parseInt(input[j]));
			}
			//**�켱���� ó���� �ؾ��Ѵ�!**
			Collections.sort(arr);
			Collections.reverse(arr); 
			
			int count = 0;
			
			while(true) {
				
				if (arr.get(0) == queue2.peek()) {
					count++;
					if (queue1.peek() == '#') {
						break;
					} else {
						arr.remove(0);
						queue2.poll();
						queue1.poll();
					}
					
				} else {
					int temp = queue2.poll();
					queue2.offer(temp);
					
					char temps = queue1.poll();
					queue1.offer(temps);
				}
				
			}
			bw.write(count + "\n");
		}
		bw.close();
	}
}