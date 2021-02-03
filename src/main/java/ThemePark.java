import attractions.Attraction;
import attractions.Playground;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark  {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(ArrayList<Attraction> attractions) {
        this.attractions = attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public void setStalls(ArrayList<Stall> stalls) {
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> reviews = new ArrayList<>();
        for (Attraction attraction : attractions) {
            reviews.add((IReviewed) attraction);
        }
        for (Stall stall : stalls) {
            reviews.add((IReviewed) stall);
        }
        return reviews;
    }
}
