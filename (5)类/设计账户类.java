package Circle;

import java.util.Scanner;

//账户类
class Account{
	double balance;//余额 
	Account(){
		balance = 0;
		System.out.println("你的账户已经创建，余额为"+balance+"元");
	}
	void qukuan(double price){
		if(balance < price){
			System.out.println("余额不足");
		}else{
			balance = balance - price;
			System.out.println("已取出"+price+"元，当前余额为："+balance+"元");

		}
		
	}
	
	void cunkuan(double price){
		balance = balance + price;
		System.out.println("已存入"+price+"元，当前余额为："+balance+"元");
		return; 
	}
	
	void showyue(){
		System.out.println("当前余额为："+balance+"元");

	}
}
public class text {
	public static void main(String []args){
		Account account = new Account();
		Scanner sc = new Scanner(System.in);  
		boolean flag = true;
		int a;
		
		
		
		while(flag) {
			System.out.println("（1）存钱");
			System.out.println("（2）取钱");
			System.out.println("（3）查询余额");
			System.out.println("（0）退出");
			System.out.println("输入你要进行的操作");
			a = sc.nextInt(); 
			switch (a)
			{
			case 1:
				double price;
				System.out.print("输入你要存入的现金：");
				price = sc.nextDouble();
				account.cunkuan(price);
				break;
			case 2:
				double price1;
				System.out.print("输入你要取出的现金：");
				price1 = sc.nextDouble();
				account.qukuan(price1);
				
				break;
			case 3:
			account.showyue();

				break;
			
			case 0:
				flag = false;
				System.out.print("退出");
				break;
			default:
				break;
			}
		}
		
		
	}
	
}


