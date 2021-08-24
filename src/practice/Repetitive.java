package practice;

import java.util.Scanner;

public class Repetitive {
	public void testFor() {
		//for(초기식;조건식;증감식 {}
		for(int i =0; i < 10; i++) {
			System.out.println(i + "번쨰 출력");	
		}
		//i를 감소
		for(int i =10; i > 0; i--) {
			System.out.println(i + "번쨰 출력");
		}
		for(int i =0; i < 10; i +=2) {
			System.out.println(i + "번쨰 출력");	
		}
		//int가 아닌 char를 입력하면?
		for(char ch ='a'; ch <= 'e'; ch++) {
			System.out.println(ch + "번쨰 출력");
		}
				
	}
	public void testWhile( ) {
		int i = 0;
		while(i < 10) {
			System.out.println(i + "번쨰 i 출력");
			i++;
		}
		//감소
		int j =10;
		while(j > 0) {
			System.out.println(j + "번쨰 j 출력");
			j--;
		}
		//무한루프 : 조건 값을 항상 true
		int k = 0;
		while(true) {
			System.out.println(k++ + "번쨰 k 출력");
		}
	}
	public void testDoWhile( ) {

		//초기식
		int i = 0;
		do {
			System.out.println(i + "번쨰 i 출력");
			i++;
		} while(i < 10);
		
		
		int j = 10;
		do {
			System.out.println(j + "번쨰 j 출력");
			j--;
		} while(j > 0);
		
		
		int k = 0;
		do {
			System.out.println(k++ + "번쨰 k 출력");
			}while(true);
	}
	public void testGugudan( ) {
		//중첩 반목문
		for(int i =2; i < 10; i++) {
			System.out.println("====" + i + "단====");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
			
		}
		//while 문
		int i = 2;
		while(i < 10) {
			System.out.println("====" + i + "단====");
			int j = 1;
			while(j < 10) {
				System.out.println(i + "x" + j + "=" + i * j);
				j++;
			}
			i++;
		}
		
	}
	public void testBreak() {
		//숫자를 입력받아 입력받은 숫자만큼만 반복적으로 출력후 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("반복할 횟수 입력 : ");
		int num = sc.nextInt();
		
		int i = 1;
		while(true) {
			System.out.println(i + "번쨰 i 출력");
			if(i == num) {
				break;
			}
			i++;
		}
	}
	public void testFor2() {
		//초기식이 생략된 for문
		int i = 0;
		for(; i<10;i++) {
			System.out.println(i + "번쨰 i 출력");
		}
		//조건식 생략 for문
	    for(int j = 0; ; j++) {
	    	if(j<10) {
	    		System.out.println(j + "번쨰 j 출력");
	    	}else {
	    		break;
	    	}
	    }
	  //증감식 생략 for문
		for(int k=0; k < 10;) {
			System.out.println(k + "번쨰 k 출력");
			k++;
		}
		//모두 생략
		int l = 0;
		for(;;) {
			if(l<10) {
				System.out.println(l + "번쨰 l 출력");
			}else {
				break;
			}
			l++;
		}
		
	}
	
}
