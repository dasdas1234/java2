package day8_array;

import java.util.Scanner;

public class ArrayIndex { //배열의 첨자 같은 자료형의 변수를 모아놓은것

	public static void main(String[] args) {
		// 배열만들기
		int nums[] = new int[5];
		//배열의 초기값을 키보드로 정수만 입력하시오.
		Scanner scan = new Scanner(System.in);
		int i =0;
		while(i<nums.length) {
			System.out.print("nums["+i+"]=");
			nums[i] =scan.nextInt();
			i++;
		}
		/*
		 * nums[0] =10; nums[1] =4; nums[2] =6;
		 */
		System.out.println("-------------------");
		for( i =0; i<nums.length; i++) {
			if(i%2==0)
				continue;
			System.out.println("nums["+i+"]=" +nums[i]);
		}
	}
}
