package ThemePark;

public class Visitor implements ITicketed{
    private int age;
    private double heightInMeters;
    private double money;
    private double price;

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

    public double priceForVisitor(Visitor visitor){
        if (getAge() < 5){
            this.price = 1.00;
        }else if (getAge() > 60){
            this.price = 6.00;
        }else {
            this.price = defaultPrice();
        }
        return this.price;
    }


}

