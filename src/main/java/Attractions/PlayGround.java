package Attractions;

import Attractions.Attraction;
import ThemePark.Visitor;
import ThemePark.ISecurity;


public class PlayGround extends Attraction implements ISecurity {

    public PlayGround(String name){
        super(name);
    }

    public boolean IsAllowed(Visitor visitor){
        if (visitor.getAge() > 15 ) {
            return true;
        }
        return false;
    }

}
