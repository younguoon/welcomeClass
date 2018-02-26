package class_0205;

import java.util.Random;

import welcomeJavaClass.Main;

public class IntArraySorterest {
	private static final Random ran = new Random(1234);
	
	private static void execute(int length){
		// length 길이의 배열을 생성하고 난수로 데이터 작성
		int[] data = new int[length];
		for(int i = 0; i<length; i++){
			data[i] = ran.nextInt(data.length);
		}
		
		// 데이터를 추력
		IntArraySorter sorter = new IntArraySorter(data, length);
		System.out.println("정렬전 : " + sorter);
		
		data[1] = 100;
		data[2] = 200;
		System.out.println("정렬전 : " + sorter);
		
		
		// 정렬 결과를 출력
		sorter.sort();
		System.out.println("정렬후" + sorter);
		System.out.println(); 
	}
	public static void main(String[] args) {
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		
	}
}
