package array;

import java.util.Arrays;

public class Array {
	public void testArray( ) {
		//배열 선언 : stack 공간 생성, 주소값을 가지고 있음
		boolean[] booleanArr; //논리형 배열
		
		//배열 할당 : heap에 공간 생성, 진짜 데이터를 가지고 있음
		double[] doubleArr = new double[2];
		
		//배열초기화
		//인덱스 이용
		doubleArr[0] = 100.123456;
		doubleArr[1] = Math.random();
		
		//0 <= Math.random() < 1
		//1 부터 10 까지의 정수
		//0*10 <= (int)(Math.random() *10) +1 < 1 * 10 +1
		
		//선언과 동시에 초기화
		String[] strArr = {"치킨", "피자", "족발"}; //크기가 3인 공간 생성, 값 초기화
		char[] charArr = new char[] {'a','b','c','d','e'};
		
		//for문을 이용한 초기화
		int[] intArr = new int[6];
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = i;
		}
		//출력
		//하나씩 접근해서 출력하는 방법
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.println(doubleArr[i]);
		}
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		//전체 출력 - String 자체로 뽑아오는 것
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(charArr));
	}
	

}
