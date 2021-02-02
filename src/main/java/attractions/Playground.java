package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 16)
            { return false;
        } else {
            return true;
            }
        }

    @Override
    public double defaultPrice() {
        return 3.00;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 1.50;
    }
}

