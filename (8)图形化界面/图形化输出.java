import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class test {
    public static void main(String[] args) {
        JFrame jf = init();
       jf.setLayout(new BorderLayout());
        int max = 8;
        String title1[]= {"排序前数值序列"};
        String title2[]= {" 排序后数值序列"};
        Integer [][] datafront = new Integer[max][1];
         //函数1 传入一个数组,重新生成数组随机数
        Integer [][] datarear= new Integer [max][1];
        for(int i=0; i< datafront.length; i++){
            datarear[i][0] =0;
            datafront[i][0] = 0;
        }
        //函数2,传入两个数组,把第一个数组的随机数排序赋给第二个数组//窗口监视器
        //默认为0
        JTable table  = new JTable();
        JTable table1 = new JTable();
        jf.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowActivated(WindowEvent e){
                DefaultTableModel tableModel=(DefaultTableModel) table.getModel();    //获得表格模型
                DefaultTableModel tableModel1=(DefaultTableModel) table1.getModel();
               tableModel.setDataVector(datafront,title1);tableModel1.setDataVector(datarear,title2);
                table.setRowHeight(30);
                table1.setRowHeight(30);
                table.setEnabled(false);
                table1.setEnabled(false);
            }
        });
        //随机生成按钮
        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(1,2));
        JButton jbt = new JButton("随机生成");
        JButton jbt1 = new JButton("排序");
        jp3.add(jbt);//按钮加入面板
        jp3.add(jbt1);
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tableModel=(DefaultTableModel) table.getModel();
                initrandom(datafront);
                tableModel.setDataVector(datafront,title1);}
        });
        jbt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel tableModel=(DefaultTableModel) table1.getModel();
                sort(datafront,datarear);
                tableModel.setDataVector(datarear,title2);
            }
        });
        JPanel jp1_2 = new JPanel();
        jp1_2.setLayout(new GridLayout(1,2));
        jp1_2.add(new JScrollPane(table));
        jp1_2.add(new JScrollPane(table1));
        jf.add(jp1_2,BorderLayout.CENTER);
        jf.add(jp3,BorderLayout.SOUTH);//面板加入容器
        jf.setVisible(true);
    }//初始化窗口
    public static JFrame init(){
    JFrame jf = new JFrame("第一个窗口");
        //设置大小
        //jf.setLayout(new FlowLayout());
        int WIDTH = 400;
        int HEIGHT = 328;
        Toolkit kit= Toolkit.getDefaultToolkit();
        Dimension screensize= kit.getScreenSize();
        int width = screensize.width;
        int height = screensize.height;
        jf.setBounds((width - WIDTH)/2, (height - HEIGHT)/2, WIDTH, HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         return jf;
    }
    public static void initrandom(Integer [][]data){
        Random random = new Random();
        for(int i=0; i<data.length; i++){
            data[i][0] = random.nextInt(100);
        }
    }
    //data1的数据排序赋给data2
    public static void sort(Integer[][] data1, Integer[][] data2){
        //赋值
        Integer[][]temp = new Integer[data1.length][1];
        for(int i=0; i<temp.length; i++){
            temp[i][0] = data1[i][0];
        }
        //排序
        for(int i=0; i< temp.length-1; i++){
            for(int j=i+1;j<temp.length ;j++){
                if(temp[i][0] > temp[j][0]){
                    int tempint = temp[i][0];
                    temp[i][0]= temp[j][0];
                    temp[j][0]= tempint;
                }
            }
        }
        //赋值
        for(int i=0; i<temp.length; i++){
            data2[i][0] = temp[i][0];
        }

    }

}
