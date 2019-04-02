package Stalls;

import Stalls.Stall;
import ThemePark.Visitor;
import ThemePark.ITicketed;


public class IceCream extends Stall implements ITicketed {

    public IceCream(String name, String ownerName, String parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public double priceForVisitor(Visitor visitor){
        double price = 2.80;
        return price;
    }

}




