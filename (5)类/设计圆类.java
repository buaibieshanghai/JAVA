package Circle;

import java.util.Scanner;

class Circle{
	
	 double centerCoordinateX;  //横坐标
	 double centerCoordinateY;  //纵坐标
	 double radius;				//半径
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
		System.out.print("请输入圆的横纵坐标：");
		centerCoordinateX = sc.nextDouble();
		centerCoordinateY = sc.nextDouble();
		System.out.print("请输入圆的半径");
		radius = sc.nextDouble();
	}
	 void radius(Circle circle2){
		 //圆心距离
		 double centralDistance = Math.sqrt( Math.pow(circle2.centerCoordinateY-this.centerCoordinateY, 2)+Math.pow(circle2.centerCoordinateX-this.centerCoordinateX,2));
		 //半径相加
		 double radiussum = circle2.radius + this.radius;
		 
		 //半径差
		 double radiuscha = Math.abs(circle2.radius - this.radius); 
		 //圆心距离 等于半径和    外切
		 
		 //圆心距离 大于半径和  相离
		 //圆心距离 小于 半径和 相交
		 //圆心距离 等于 半径之差 内切
		 //圆心距离 小于 半径之差 内含
		 
		 if(centralDistance  <= radiuscha){
			 if(circle2.radius < this.radius){
				 System.out.println("第二个圆在第一个圆内!");
			 }else if(circle2.radius == this.radius ){
				 System.out.println("第二个圆和第一个圆重叠！");
			 }else{
				 System.out.println("第二个圆既不在第一个圆内，也不和第一个圆重叠！");
			 }
			 
		 }else{
			 
			 System.out.println("第二个圆既不在第一个圆内，也不和第一个圆重叠2 ！");
		 }
	 }
	
} 
public class text {
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("输入第一个圆");
		Circle circle1= new Circle(sc);
	System.out.println("输入第二个圆");
		Circle circle2 = new Circle(sc);
		circle1.radius(circle2);
	}
}
