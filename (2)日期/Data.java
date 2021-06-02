import java.util.Scanner;

public class Data {
    public static void main(String[] args) {

        int year;
        int month;
        int day;
        while(true) {
            System.out.println("请输入年月日");
            Scanner scanner = new Scanner(System.in);
            year = scanner.nextInt();
            month = scanner.nextInt();
            day = scanner.nextInt();
            if (!isTrue(year, month, day)) {
                System.out.println("无效的日期");
            } else {
                calculateDate(year, month, day);
            }
        }

    }
    public static boolean isTrue(int year, int month,int day) {
        int month_day[] = new int[13];
        boolean flag = true;
        for (int i = 1; i < 13; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                month_day[i] = 30;
            } else if (i == 2) {
                month_day[i] = 29;
            } else {
                month_day[i] = 31;
            }
        }
        if (year < 0) {    //判断年是否合理
            flag = false;
            return flag;
        }

        if (month <= 0 || month > 12) {//判断月是否合理
            flag = false;
            return flag;
        }
        if (day <= 0 || day > month_day[month]) {
            flag = false;
            return flag;
        }
        return flag;

    }
    public static void calculateDate(int year,int month, int day){

        int month_day[] = new int[13];

        for (int i = 1; i < 13; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                month_day[i] = 30;
            } else if (i == 2) {
                month_day[i] = 29;
            } else {
                month_day[i] = 31;
            }
        }
        day++;
        if( day>month_day[month]){    //计算天数
            day=1;
            month++;
            if(month>12){
                month=1;
                year++;
            }
        }
        System.out.println("下一天日期为"+year+'.'+month+'.'+day );
    }
}
