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
	
	public void method3() {
		//문자열 무한 반복 입력
		Scanner sc = new Scanner(System.in);
		String q = "";
		while(true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			if(str.equals("stop")) {
				System.out.println("결과 : " + q);
				break;
			}
			q +=str + " ";
			System.out.println("결과 : " + q);
			
		}
	}
	public void method4() {
		//카페주문 프로그램
		Scanner sc = new Scanner(System.in);
		
		//메뉴별 주문량
		int a = 0;
		int l = 0;
		int v = 0;
		
		while(true) {
			//메뉴출력
		System.out.println("========메뉴========");
		System.out.println("1. 아메리카노   3500원");
		System.out.println("2. 카페라떄    4100원");
		System.out.println("3, 바닐라라떼   4300원");
		System.out.println("==================");
		
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		System.out.print("수량 선택 : ");
		int amount = sc.nextInt();
		
		switch(menu) {
		case 1: 
			a += amount;
			break;
		case 2: 
			l += amount;
			break;
		case 3: 
			v += amount;
			break;
		default:
			System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
			continue;
			}
			
			System.out.print("추가 주문하시겠습니까? (Y/N) : ");
			char select = sc.next().charAt(0);
			
			if(select == 'n' || select == 'N') {
				System.out.println("=============");
				if(a != 0) {
					System.out.println("아메리카노 " + a +"잔: " + 3500 * a + "원" );
				}if(l != 0) {
					System.out.println("카페라때 " + l +"잔: " + 4100 * l + "원" );
				}if(v != 0) {
					System.out.println("바닐라라때 " + v +"잔: " + 4300 * v + "원" );
				}
					System.out.println("=============");
					System.out.println("총액 : " + (a*3500 + 4100*l + 4300*v) + "원");
					break;
				}
			}
		}

}
