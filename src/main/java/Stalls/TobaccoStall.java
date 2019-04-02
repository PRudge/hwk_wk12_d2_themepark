package Stalls;

import Stalls.Stall;
import ThemePark.ISecurity;
import ThemePark.Visitor;
import ThemePark.ITicketed;
import ThemePark.ISecurity;



public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, String parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public double priceForVisitor(Visitor visitor){
        return 6.60;
    }

    public boolean IsAllowed(Visitor visitor){
        if (visitor.getAge() > 18 ) {
            return true;
        }
        return false;
    }

}
