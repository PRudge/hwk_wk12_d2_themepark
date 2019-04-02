package Attractions;

import Attractions.Attraction;
import ThemePark.Visitor;
import ThemePark.IReview;
import ThemePark.ISecurity;

public class RollerCoaster extends Attraction implements IReview, ISecurity {

    public RollerCoaster(String name){
        super(name);
    }

    public boolean IsAllowed(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeightInMeters() > 1.45){
            return true;
        }
        return false;
    }

}




