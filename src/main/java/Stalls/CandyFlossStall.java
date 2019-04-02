package Stalls;

import Stalls.Stall;
import ThemePark.Visitor;
import ThemePark.ITicketed;



public class CandyFlossStall extends Stall implements ITicketed {

    public CandyFlossStall(String name, String ownerName, String parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public double priceForVisitor(Visitor visitor){
        return 4.20;
    }

}
