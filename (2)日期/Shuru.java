import java.util.Scanner;

public class Shuru {
    public static void main(String[] args) {
        double x;
         double y;
         double z;
         Scanner scanner= new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("请输入x,y,z");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            z = scanner.nextDouble();

            Double result = 3*x+(4*y*y+5)/2-7*(z+4)+(3+x*x)/(x+y*z);
            System.out.println("结果是:"+result);
        }

    }
}
