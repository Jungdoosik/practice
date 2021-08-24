package test;

import java.util.Scanner;

public class RepetitiveTest {
	public void method1() {
		//피라미드 모양 별찍기
		for(int i = 0; i <4 ; i++) {
			//내부 for문 칸 조건
			// 공백 출력(3.2.1.0)
			for(int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void method2() {
		System.out.println("홀수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//num이 7이라면?
		//상단부 (피라미드) 0~2행
		for(int i = 0; i < num /2; i++) {
			//공백출력 (3.2.1)
			for(int j = num/2; j > i; j--) {
				System.out.print(" ");
				}
			//별출력(1.3.5)
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		for(int i= num/2; i>=0; i--) {
			//공백출력 (3.2.1)
			for(int j = num/2; j > i; j--) {
				System.out.print(" ");
				}
			//별출력(1.3.5)
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}

}
