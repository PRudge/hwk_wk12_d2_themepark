package Stalls;

import Stalls.Stall;
import ThemePark.Visitor;
import ThemePark.ITicketed;



public class TobaccoStall extends Stall implements ITicketed {

    public TobaccoStall(String name, String ownerName, String parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public double priceForVisitor(Visitor visitor){
        return 6.60;
    }

}
