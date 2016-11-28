package ex;

/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int s;
		for (int j = 1; j <= n; j++) {
			if (n % j == 0)
				System.out.println(j);
		}
		boolean x = true;
		if (n == 1) {
			System.out.println("不是質數");
		} else {
			double y = Math.sqrt(n);
			for (int i = 2; i <= y; i++) {
				if (n % i == 0) {
					x = false;
				}
			}
		}
		if (x == true) {
			System.out.println("質數");
		} else {
			System.out.println("不是質數");
		}
	}
}
