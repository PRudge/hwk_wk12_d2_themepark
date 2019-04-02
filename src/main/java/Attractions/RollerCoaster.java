package Attractions;

import Attractions.Attraction;
import ThemePark.Visitor;
import ThemePark.ITicketed;
import ThemePark.ISecurity;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

    public RollerCoaster(String name){
        super(name);
    }

    public boolean IsAllowed(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeightInMeters() > 1.45){
            return true;
        }
        return false;
    }

    public double priceForVisitor(Visitor visitor){
        if (visitor.getHeightInMeters() > 2.00){
            return visitor.priceForVisitor(visitor) * 2;
        }
        return 8.40;
    }

}




