package com.test.algorithm;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
public class AbTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
           
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            bw.write(EulerPhi(N) + "\n");
        }
        bw.flush();
        bw.close();
    }
 
    private static long EulerPhi(int n) {
        long ret = n;
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                ret -= ret / i;
            }
        }
        if (n > 1) {
            ret -= ret / n;
        }
        return ret;
    }
}


