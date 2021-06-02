package abc;

import java.util.Scanner;

public class str {
	public static void swap(char []array, int begin, int end ){
		while(begin<end){
			
			char temp = array[begin];
			array[begin] = array[end];
			array[end] = temp;
			
			begin++;
			end--;
		}
	}
	public static void main(String []args){
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		System.out.println("翻转前"+str1);
		char []array = str1.toCharArray();
		swap(array,0,array.length-1);
	String str2 = String.valueOf(array);
		System.out.println("翻转后"+str2);
		
		
	}
}
