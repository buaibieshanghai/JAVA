import java.awt.*;
import javax.swing.*;
public class test {
    public static void main(String[] args) {
        //����һ�����
        JFrame jf = init();
        //�������񲼾�
        jf.setLayout(new GridLayout(3,2));
        //��������ϵİ�ť
        String [] mianban1 = {"Ӣ��","�۱�","��Ԫ","�����","ŷԪ"};
        String [] mianban2 = {"�ڴ�","����","Ӳ��","��ʾ��","���"};
        String [] mianban3 = {"����","�߲�","����","��ͷ","ţ��"};
        String [] mianban4 = {"����","���","ƻ����","�ɿ���","����"};
        String [] mianban5 = {"�绰","�ʼǱ�","�۱�","�칤��","�ļ���"};
        //�������봰����
        jf.add(inntJPanel(mianban1));
        jf.add(inntJPanel(mianban2));
        jf.add(inntJPanel2(mianban3));
        jf.add(inntJPanel(mianban4));
        jf.add(inntJPanel(mianban5));
        jf.setVisible(true);
    }//��ʼ������
    public static JFrame init(){

        JFrame jf = new JFrame("��һ������");
        //���ô�С

        int WIDTH = 500;
        int HEIGHT = 500;
        Toolkit kit= Toolkit.getDefaultToolkit();

        Dimension screensize= kit.getScreenSize();
        int width = screensize.width;
        int height = screensize.height;
        jf.setBounds((width - WIDTH)/2, (height - HEIGHT)/2, width, height);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        return jf;
    }
    //��ʼ�����(�߽粼��)
    public static JPanel inntJPanel(String []str){
        JPanel jp = new JPanel();
    jp.setLayout(new BorderLayout());
    for(int i=0; i<5;i++){
        JButton jb = new JButton(str[i]);
        switch (i){
            case 0:
                jp.add(jb,BorderLayout.WEST);
                break;
            case 1:
                jp.add(jb,BorderLayout.NORTH);
                break;
            case 2:
                jp.add(jb,BorderLayout.SOUTH);
                break;
            case 3:
                jp.add(jb,BorderLayout.CENTER);
                break;
            case 4:
                jp.add(jb,BorderLayout.EAST);
                break;
        }

    }

    return jp;
}
    //��ʼ�����(��ʽ����)
    public static JPanel inntJPanel2(String []str) {
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        for (int i = 0; i < 5; i++) {
            JButton jb = new JButton(str[i]);
            jp.add(jb);
        }
        return jp;
    }
}



