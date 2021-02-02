package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 & visitor.getAge() >= 12) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double defaultPrice() {
        return 8.50;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 17.00;
    }
}
