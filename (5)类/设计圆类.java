package Circle;

import java.util.Scanner;

class Circle{
	
	 double centerCoordinateX;  //������
	 double centerCoordinateY;  //������
	 double radius;				//�뾶
	Circle(){
		this.centerCoordinateX = 0;
		this.centerCoordinateY = 0; 
		this.radius = 0;
	} 
	Circle(double centerCoordinateX, double centerCoordinateY, double radius){
		this.centerCoordinateX = centerCoordinateX;
		this.centerCoordinateY = centerCoordinateY;
		this.radius = radius;
	}
	Circle(Scanner sc){
		System.out.print("������Բ�ĺ������꣺");
		centerCoordinateX = sc.nextDouble();
		centerCoordinateY = sc.nextDouble();
		System.out.print("������Բ�İ뾶");
		radius = sc.nextDouble();
	}
	 void radius(Circle circle2){
		 //Բ�ľ���
		 double centralDistance = Math.sqrt( Math.pow(circle2.centerCoordinateY-this.centerCoordinateY, 2)+Math.pow(circle2.centerCoordinateX-this.centerCoordinateX,2));
		 //�뾶���
		 double radiussum = circle2.radius + this.radius;
		 
		 //�뾶��
		 double radiuscha = Math.abs(circle2.radius - this.radius); 
		 //Բ�ľ��� ���ڰ뾶��    ����
		 
		 //Բ�ľ��� ���ڰ뾶��  ����
		 //Բ�ľ��� С�� �뾶�� �ཻ
		 //Բ�ľ��� ���� �뾶֮�� ����
		 //Բ�ľ��� С�� �뾶֮�� �ں�
		 
		 if(centralDistance  <= radiuscha){
			 if(circle2.radius < this.radius){
				 System.out.println("�ڶ���Բ�ڵ�һ��Բ��!");
			 }else if(circle2.radius == this.radius ){
				 System.out.println("�ڶ���Բ�͵�һ��Բ�ص���");
			 }else{
				 System.out.println("�ڶ���Բ�Ȳ��ڵ�һ��Բ�ڣ�Ҳ���͵�һ��Բ�ص���");
			 }
			 
		 }else{
			 
			 System.out.println("�ڶ���Բ�Ȳ��ڵ�һ��Բ�ڣ�Ҳ���͵�һ��Բ�ص�2 ��");
		 }
	 }
	
} 
public class text {
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("�����һ��Բ");
		Circle circle1= new Circle(sc);
	System.out.println("����ڶ���Բ");
		Circle circle2 = new Circle(sc);
		circle1.radius(circle2);
	}
}
