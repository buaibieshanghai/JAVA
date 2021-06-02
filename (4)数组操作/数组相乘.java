package abc;

import java.util.Scanner;

public class str {
	
	public static int [][] chengji( int array1[][],int array2[][]){
		int array[][] = new int[array1.length][array2[0].length];
		if(array1[0].length!=array2.length){
			System.out.println("两个矩阵无法相乘");
			return array;
		}
		int index = array1[0].length;
		
		for(int i=0; i<array1.length; i++){   			//外循环为第一个数组行数
			for(int j = 0; j<array2[0].length; j++){	//内循环为第二个数组列数
				array1[i][0]  x  array2[0][j]
						array1[i][1]  x array2[1][j]
								array2[i][2]   x  array2[2][j]   
										array[i][j]=
			}
		}
		/*
		1 2 3       1 2      0 0
		4 5 6      	3 4      0 0
					5 3
					
		 2x3       3x2       2x2 
		*/
		return array;
	};
	
public static void main(String[] args) {
	
	int a,b;  
	Scanner sc=new Scanner(System.in); 
	System.out.println("输入第一个矩阵的长和宽");
	a = sc.nextInt();
	b = sc.nextInt();
	
	int array1[][] = new int[a][b];

	System.out.println("请输入一个"+a+"X"+b+"的矩阵");
	for(int i=0; i<a; i++){
		for(int j=0; j<b; j++ ){
			array1[i][j] = sc.nextInt(); 
		}
	}
	

	System.out.println("输入第二个矩阵的长和宽");
	a = sc.nextInt();
	b = sc.nextInt();
	int array2[][] = new int[a][b];

	System.out.println("请输入一个"+a+"X"+b+"的矩阵");
	for(int i=0; i<a; i++){
		for(int j=0; j<b; j++ ){
			array2[i][j] = sc.nextInt(); 
		}
	}
	
	int array3[][] =  chengji(array1,array2);
	for(int i=0; i<array3.length; i++){
		for(int j=0 ; j<array3[0].length;j++){
			 System.out.print(array3[j][i]+" ");
		}
		System.out.println();
	}
	
}
	
	
	
}
