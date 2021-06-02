package Graph;
//图形父类
public class Graph {
public String name;//图形名字
    Graph(){
        name= null;
    }
    Graph(String name) {
        this.name = name;
    }
public void calculateSize(){//计算并且输出
         }

    public static void main(String[] args) {


        Graph cicle = new Circle(2);
        Graph changfang = new Changfang(2,3);

        calculate(cicle);
        calculate(changfang);

    }


    public static void calculate(Graph graph){
        graph.calculateSize();
    }

}
//二维图形
class TwoDimensiona extends Graph{
    public String type;
    TwoDimensiona(){
        super("二维图形");
        type = null;
    }
   public  TwoDimensiona(String type){
       super("二维图形");
       this.type = type;
    }

    @Override
    public void calculateSize() {
        System.out.println(name+type+"面积为:");
    }
}

class Circle extends TwoDimensiona{
    public int banjing;   //半径
    Circle(){
        super("圆形");
        this.banjing = 0;
    }
    Circle(int banjing){
        super("圆形");
        this.banjing = banjing;
    }

    @Override
    public void calculateSize() {
        super.calculateSize();
        System.out.println(3.14*banjing*banjing );
    }
}
class Changfang extends TwoDimensiona{
    public int x;   //chang
    public int y;   //kuan
    Changfang(){
        super("长方形");
        this.x = 0;
        this.y = 0;
    }
    Changfang(int x,int y){
        super("长方形");
        this.x = x;
        this.y = y;
    }

    @Override
    public void calculateSize() {
        super.calculateSize();
        System.out.println(x*y);
    }
}












//三维图形
class ThreeDimensiona extends Graph{


}

