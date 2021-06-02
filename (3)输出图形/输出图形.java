package xyz;
import java.util.Scanner;
public class xyz{
	
	public static void main(String []args){
		
		while(true){
			
		
		System.out.println("请输入整数n：");
		int a;
		
		Scanner scanner = new Scanner(System.in);
		
		
		a= scanner.nextInt();
		if(a<0){
			System.out.println("输入数据有误");
		}
		else{
		show(a);	
		}
		}
	
	}
	public static void show(int a){
		for(int i=1; i<= 2*a-1 ; i++){
			for(int j=1; j<=2*a-1; j++){
				if(i<=a){
					if(a-i+1==j || a+i-1==j){
						System.out.print(i);
					}
					else{
						System.out.print(" ");
					}
				}
				if(i>a){
					if(a-(2*a-i)+1==j ||a+(2*a-i)-1 ==j){
						System.out.print(2*a-i);
					}
					else{
						System.out.print(" 1");
					}
				}
				
			}
			System.out.println();
		}
	};
	
	
	
}

	
	


