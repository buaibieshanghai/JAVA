(1)代码1
package haha;
import java.util.Scanner;
public class haha {
    public static void main(String[] args) {
        /*
        System.out.println("输入年份");
        int year;
    Scanner scanner = new Scanner(System.in);

         year = scanner.nextInt();
        if(year % 400 == 0){
            System.out.println("true");
        }else if(!(year % 100==0)){
            if(year % 4==0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }else{
            System.out.println("false");
        }

         */
        int year;
        int month;
        int day;
        while(true){
            System.out.println("请输入年,月,日");
            Scanner scanner = new Scanner(System.in);
            year = scanner.nextInt();
            month = scanner.nextInt();
            day = scanner.nextInt();
            int daysum = 0;
            for(int i=1; i<year; i++){

                daysum = daysum + returnday(i);

            }

            daysum = daysum + returnhasday(year,month,day);
            System.out.println(daysum);
            int i= (daysum-1)%7+1;
            switch (i){
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期二");
                    break;
                case 3:
                    System.out.println("星期三");
                    break;
                case 4:
                    System.out.println("星期四");
                    break;
                case 5:
                    System.out.println("星期五");
                    break;
                case 6:
                    System.out.println("星期六");
                    break;
                case 7:
                    System.out.println("星期日");
                    break;
            }
        }

    }
    //传入年月日,返回该年已经度过的天数
    public static int returnhasday(int year,int month,int day){
        int month_day[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(isRunyear(year)){
            month_day[1] = 29;
        }
        int day_sum=0;
        for(int i=0; i<month-1; i++){
            day_sum = day_sum+month_day[i];
        }
        return day_sum+day;
    }

    //传入年份,返回该年份的天数
   public static int returnday(int year){
        //平年返回365
    if(isRunyear(year)){
        return 366;

    }//闰年返回366
    else{
        return 365;
    }

    }

   public static boolean isRunyear(int year ){
        if(year % 400 == 0){
           return true;
        }else if(!(year % 100==0)){
            if(year % 4==0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

}
(2)代码2
package haha;
import java.util.Scanner;

//父类 水果类
class Fruit{
    public String type;    //水果的类型
    public String season; //适宜吃的季节
    public String role;   //作用
    public Fruit(String type,String season,String role){
        this.type = type;
        this.season = season;
        this.role = role;
    }
    public void show(){
        System.out.println("水果"+type + ",适合在"+season +"吃,可以"+role);
    }
}
class Apple extends Fruit{
    public Apple() {
        super("苹果", "冬天", "减肥");
    }
}
class Xigua extends Fruit{
    public Xigua() {
        super("西瓜", "夏天", "解渴");
    }
}

class Chengzi extends Fruit{
    public Chengzi() {
        super("橙子", "春天", "补充维生素");
    }
}

class Pear extends Fruit{
    public Pear() {
        super("梨", "秋天", "止咳");
    }
}
public class haha {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit xigua = new Xigua();
        Fruit chengzi = new Chengzi();
        Fruit pear = new Pear();
        apple.show();
        xigua.show();
        chengzi.show();
        pear.show();
    }

}









