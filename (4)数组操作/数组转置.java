package abc;

import java.util.Scanner;

public class str {

	public static void zhuanzhi(int [][]array){
		for(int i=0; i< array[0].length; i++){
			for(int j=0; j<array.length; j++){
				 System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args){
		int array[][] = new int[3][4];
		Scanner sc=new Scanner(System.in); 
		System.out.println("请输入一个3X4的矩阵");
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++ ){
				array[i][j] = sc.nextInt(); 
			}
		}
		zhuanzhi(array);
		
		
		
	}
}

