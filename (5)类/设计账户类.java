package Circle;

import java.util.Scanner;

//�˻���
class Account{
	double balance;//��� 
	Account(){
		balance = 0;
		System.out.println("����˻��Ѿ����������Ϊ"+balance+"Ԫ");
	}
	void qukuan(double price){
		if(balance < price){
			System.out.println("����");
		}else{
			balance = balance - price;
			System.out.println("��ȡ��"+price+"Ԫ����ǰ���Ϊ��"+balance+"Ԫ");

		}
		
	}
	
	void cunkuan(double price){
		balance = balance + price;
		System.out.println("�Ѵ���"+price+"Ԫ����ǰ���Ϊ��"+balance+"Ԫ");
		return; 
	}
	
	void showyue(){
		System.out.println("��ǰ���Ϊ��"+balance+"Ԫ");

	}
}
public class text {
	public static void main(String []args){
		Account account = new Account();
		Scanner sc = new Scanner(System.in);  
		boolean flag = true;
		int a;
		
		
		
		while(flag) {
			System.out.println("��1����Ǯ");
			System.out.println("��2��ȡǮ");
			System.out.println("��3����ѯ���");
			System.out.println("��0���˳�");
			System.out.println("������Ҫ���еĲ���");
			a = sc.nextInt(); 
			switch (a)
			{
			case 1:
				double price;
				System.out.print("������Ҫ������ֽ�");
				price = sc.nextDouble();
				account.cunkuan(price);
				break;
			case 2:
				double price1;
				System.out.print("������Ҫȡ�����ֽ�");
				price1 = sc.nextDouble();
				account.qukuan(price1);
				
				break;
			case 3:
			account.showyue();

				break;
			
			case 0:
				flag = false;
				System.out.print("�˳�");
				break;
			default:
				break;
			}
		}
		
		
	}
	
}


