package ThemePark;

public class Visitor {
    private int age;
    private double heightInMeters;
    private double money;

    public Visitor(int age, double heightInMeters, double money){
        this.age = age;
        this.heightInMeters = heightInMeters;
        this.money = money;

    }

    public int getAge() {
        return age;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public double getMoney() {
        return money;
    }
}

