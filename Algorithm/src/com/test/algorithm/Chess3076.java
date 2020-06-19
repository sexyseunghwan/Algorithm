package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Chess3076 {
	
	//���� 3076 ���� ������� ü����
	/*
	 ����̴� ü������ ������� �Ѵ�.

	ü������ ����ĭ�� ��ĭ���� �̷���� �ִ�. ���� ���� ��ĭ�� ���� �������̰�, ������ ���� ������ ����� �����ư��鼭 �����Ѵ�. �������� 'X'��, ����� '.'�� ǥ���Ѵ�.

	������� ü������ R�� * C���� �̷���� �־�� �Ѵ�. ��, ������ ���� ���̴� ���� A����ŭ �̸�, ������ ���� �ʺ�� ���� B�� ��ŭ�̴�. ���� ����� ���� �����ϸ� ����.

	R, C, A, B�� �־����� ��, ������� ü������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� �� ���� ���� R�� C�� �־�����. (1 �� R, C �� 10)

	��° �ٿ� �� ���� ���� A�� B�� �־�����. (1 �� A, B �� 10)

	���
	����� R * A�� C * B���� �̷���� �־�� �ϸ�, �������� ������ ������� ü������ ����Ѵ�.
	
	
	5 5
	2 3
	
	
	->
	
	
	XXX...XXX...XXX
	XXX...XXX...XXX
	...XXX...XXX...
	...XXX...XXX...
	XXX...XXX...XXX
	XXX...XXX...XXX
	...XXX...XXX...
	...XXX...XXX...
	XXX...XXX...XXX
	XXX...XXX...XXX
	
	 * */
	
	
	public static void main(String[] args) throws Exception{
		//Ǯ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer stk1 = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(stk1.nextToken());//��
		int c = Integer.parseInt(stk1.nextToken());//��
		
		StringTokenizer stk2 = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(stk2.nextToken());//��ĭ�� ��
		int b = Integer.parseInt(stk2.nextToken());//��ĭ�� ��
		
		String[] arr = {"X","."};
		
		int index = 0;
		
		for (int i = 0; i < r; i++) {
			String str = "";
			
			for (int j = 0; j < c; j++) {
				for (int k = 0; k < b; k++) {
					str += arr[index % 2];
				}
				index++;
			}
			
			for (int s = 0; s < a; s++) {
				bw.write(str + "\n");
			}
			
			if (c % 2 == 0) {
				index++;
			}
		}
		
		bw.close();
	}
}