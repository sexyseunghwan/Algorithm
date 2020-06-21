package com.test.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CondoSelect2246 {
	/*
	 
	 ����
	�ܵ��� ������ ������ �������̸� �ΰ� �ٴ尡�� ����� ������ �Ϸ� �Ѵ�. �̸� ���� �켱 ������ �ܵ� �� ���� �ĺ��� �����Ϸ� �ϴµ�,
	 ���� �� ������ �����ϴ� �ܵ� X�� �ĺ��� �ȴ�.

	X���� �ٴ尡�� �� ����� �ܵ����� ��� X���� ���ں� �� ��δ�.
	X���� ���ں� �� �� �ܵ����� ��� X���� �ٴ尡���� �� �ִ�.
	�� �ܵ��� �ٴ尡������ �Ÿ��� ���ں� ���� ������ �־����� ��, �ĺ� �ܵ��� ������ ���س��� ���α׷��� �ۼ��Ͻÿ�.

	�Է�
	ù° �ٿ� �ܵ��� ������ ��Ÿ���� �ڿ��� N(1��N��10,000)�� �־�����. ���� N���� �ٿ��� �� �ܵ��� ���� ������ ��Ÿ���� �� ���� D(1��D��10,000), C(1��C��10,000)�� �־�����.
	D�� �� �ܵ��� �ٴ尡�κ����� �Ÿ��� ��Ÿ����, C�� �� �ܵ��� ���ں� ��Ÿ����. D�� C���� ���� ���� �ܵ��� �־������� �ʴ´�.

	���
	ù° �ٿ� �ĺ��� �� �� �ִ� �ܵ��� ���� ����Ѵ�.
	 
	 
	 ���� �Է� 1 
	5
	300 100
	100 300
	400 200
	200 400
	100 500

	���� ��� 1 
	2
	 
	 */
	
	public static void main(String[] args) throws Exception{
		
		
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int condo = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[condo][2];
		
		for (int i = 0; i < condo; i++) {
			StringTokenizer stk = new StringTokenizer(br.readLine());
			
			matrix[i][0] = Integer.parseInt(stk.nextToken());//distance
			matrix[i][1] = Integer.parseInt(stk.nextToken());//cost
		}
				
		int count = 0;
		
		for (int i = 0; i < condo; i++) {
			boolean flag = true;
			for (int j = 0; j < condo; j++) {
				if (i != j) {
					if (matrix[i][0] >= matrix[j][0]) {
						if (matrix[i][1] >= matrix[j][1]) {
							flag = false;
							break;
						}
					}
					
					if (matrix[i][1] >= matrix[j][1]) {
						if (matrix[i][0] >= matrix[j][0] ) {
							flag = false;
						}
					}
				}
			}
			if (flag) count++;
		}
		
		bw.write(count + "\n");
		bw.close();
		
		
	}
}
