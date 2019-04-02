package Attractions;

import Attractions.Attraction;
import ThemePark.ISecurity;
import ThemePark.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name){
        super(name);
    }



    public double priceForVisitor(Visitor visitor){
      if (visitor.getAge() < 12){
        return visitor.priceForVisitor(visitor) * 1/2;
      }
        return visitor.priceForVisitor(visitor);
      }

}
