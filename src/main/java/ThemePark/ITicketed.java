package ThemePark;

public interface ITicketed {
    double priceForVisitor(Visitor visitor);


    default double defaultPrice(){
        double defaultPrice = 10.00;
        return defaultPrice;
    }
}

