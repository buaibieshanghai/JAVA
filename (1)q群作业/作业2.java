package haha;
import java.util.Scanner;
public class haha {
    public static void main(String[] args) {
        int maxStudent = 5; // 学生个数
        int maxClass = 6;   //课程个数
        String student_array[] = {"李白", "秦始皇", "诸葛亮", "张飞", "貂蝉"};


        String class_array[] = {"数学", "物理", "化学", "语文", "英语", "生物"};
        int array[][] = new int[maxStudent][maxClass];
        int score = 100;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = score;
                score = score - 10;
            }
            score = score + 50;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        //找到成绩最好的学生
        int indexstudent = 0;
        int allscore = 0;
        int maxscore = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                allscore = allscore + array[i][j];
            }
            if (maxscore < allscore) {
                maxscore = allscore;
                indexstudent = i;
            }
            allscore = 0;
        }
        System.out.println("成绩最高的学生:" + student_array[indexstudent]);
        //找到任意学生最高成绩和最低成绩
        String name = "诸葛亮";
        int indexname = 0;
        int indexmaxclass = 0;
        int indexminclass = 0;
        for (int i = 0; i < student_array.length; i++) {
            if (name == student_array[i]) {
                indexname = i;
                break;
            }
        }
        int scoremax = array[indexname][0];
        int scoremin = array[indexname][0];

        for (int j = 0; j < array[0].length; j++) {
            if (scoremax < array[indexname][j]) {
                scoremax = array[indexname][j];
                indexmaxclass = j;
            }
            if (scoremin > array[indexname][j]) {
                scoremin = array[indexname][j];
                indexminclass = j;
            }
        }
        System.out.println("学生" + name + "最高科目成绩:" + class_array[indexmaxclass] + scoremax);
        System.out.println("学生" + name + "最低科目成绩:" + class_array[indexminclass] + scoremin);
        //针对某一门课程进行排序
        int indexclass=5;
        String classname = "生物";
        for(int i=0; i<array[0].length-1; i++){
            for(int j=i+1; j<array[0].length;j++){
                if(array[i][indexclass]>array[i][indexclass]){
                    for(int z=0; z<array[0].length; z++){
                        int temp1 = array[i][z];
                        array[i][z] = array[j][z];
                        array[j][z] = temp1;
                    }
                }
            }
        }
        //按照学习成绩对学生进行排序
    int array_sum[]={0,0,0,0,0};
    int allscore1=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                allscore1 = allscore1 + array[i][j];
            }
           array_sum[i]= allscore1;
            allscore1 = 0;
        }
        for(int i=0; i<array_sum.length; i++){
            System.out.println(array_sum[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int minsc= array_sum[0];
        for(int i=0; i<array_sum.length-1; i++){
            for(int j=i+1; j<array_sum.length;j++){
                if(array_sum[i]>array_sum[j]){
                    int temp = array_sum[j];
                    array_sum[j] = array_sum[i];
                    array_sum[i] = temp;
                    for(int z=0; z<array[0].length; z++){
                        int temp1 = array[i][z];
                        array[i][z] = array[j][z];
                        array[j][z] = temp1;
                    }
                }
            }
        }







    }

}




