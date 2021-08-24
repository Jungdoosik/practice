package practice;

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
}
