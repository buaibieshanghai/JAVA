package abc;

import java.util.Scanner;

public class str {
	
	public static int [][] chengji( int array1[][],int array2[][]){
		int array[][] = new int[array1.length][array2[0].length];
		if(array1[0].length!=array2.length){
			System.out.println("���������޷����");
			return array;
		}
		int index = array1[0].length;
		
		for(int i=0; i<array1.length; i++){   			//��ѭ��Ϊ��һ����������
			for(int j = 0; j<array2[0].length; j++){	//��ѭ��Ϊ�ڶ�����������
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
	System.out.println("�����һ������ĳ��Ϳ�");
	a = sc.nextInt();
	b = sc.nextInt();
	
	int array1[][] = new int[a][b];

	System.out.println("������һ��"+a+"X"+b+"�ľ���");
	for(int i=0; i<a; i++){
		for(int j=0; j<b; j++ ){
			array1[i][j] = sc.nextInt(); 
		}
	}
	

	System.out.println("����ڶ�������ĳ��Ϳ�");
	a = sc.nextInt();
	b = sc.nextInt();
	int array2[][] = new int[a][b];

	System.out.println("������һ��"+a+"X"+b+"�ľ���");
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
