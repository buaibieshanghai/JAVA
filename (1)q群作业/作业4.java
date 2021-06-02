interface Animal{
    String cry();
    String getAnimalName();

}
class Simulator{
public void playSound(Animal animal){
    System.out.println("动物名称:"+animal.getAnimalName());
    System.out.println("动物叫声:"+animal.cry());
}
}
class Dog implements Animal{
    private String name = "狗";
    private String cry = "汪汪!";
    @Override
    public String cry() {
        return cry;
    }
    @Override
    public String getAnimalName() {
        return name;
    }
}
class Cat implements Animal{
    private String name = "猫";
    private String cry = "喵喵~";
    @Override
    public String cry() {
        return cry;
    }
    @Override
    public String getAnimalName() {
        return name;
    }
}

public class test{
    public static void main(String[] args) {
        Simulator sim = new Simulator();
        sim.playSound(new Dog());
        sim.playSound(new Cat());
    }
}



