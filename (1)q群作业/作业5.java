import java.io.InputStream;
//异常
class InvalidTriangleException extends  Exception{
    String message;
    InvalidTriangleException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
class Triangle{
private int x;
private int y;
private int z;
public Triangle(int x,int y,int z){
    this.x = x;
    this.y = y;
    this.z = z;
}
public void showInfo() throws InvalidTriangleException  {
if(!isSanjiaoxing()){
    throw new InvalidTriangleException("异常:无法构成三角形");
}
else{
    System.out.println("x:"+x);
    System.out.println("y:"+y);
    System.out.println("z:"+z);
}
}
public void getCircumference()throws InvalidTriangleException{
    if(!isSanjiaoxing()){
        throw new InvalidTriangleException("异常:无法构成三角形");
    }
    else{
        System.out.println("周长:"+(x+y+z));
    }
}
private boolean isSanjiaoxing() {
    if(x+y>z&&x+z>y&&z+y>x){
        return true;
    }else{
        return false;
    }
}
}
public class test {
    public static void main(String[] args)  {
        Triangle sanjiaoxing = new Triangle(3,4,5);
        Triangle sanjiaoxing1 = new Triangle(0,4,5);
        try{
            sanjiaoxing.showInfo();
            sanjiaoxing.getCircumference();
            sanjiaoxing1.showInfo();
            sanjiaoxing1.getCircumference();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}







import java.awt.*;
import javax.swing.*;
public class test {
    public static void main(String[] args) {
        //创建一个面板
        JFrame jf = init();
        //设置网格布局
        jf.setLayout(new GridLayout(3,2));
        //设置面板上的按钮
        String [] mianban1 = {"英镑","港币","美元","人民币","欧元"};
        String [] mianban2 = {"内存","主板","硬盘","显示器","鼠标"};
        String [] mianban3 = {"大米","蔬菜","稻子","猪头","牛肉"};
        String [] mianban4 = {"蛋糕","面包","苹果派","巧克力","奶酪"};
        String [] mianban5 = {"电话","笔记本","港币","办工座","文件夹"};
        //把面板加入窗体中
        jf.add(inntJPanel(mianban1));
        jf.add(inntJPanel(mianban2));
        jf.add(inntJPanel2(mianban3));
        jf.add(inntJPanel(mianban4));
        jf.add(inntJPanel(mianban5));
        jf.setVisible(true);
    }//初始化窗口
    public static JFrame init(){

        JFrame jf = new JFrame("第一个窗口");
        //设置大小

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
    //初始化面板(边界布局)
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
    //初始化面板(流式布局)
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



