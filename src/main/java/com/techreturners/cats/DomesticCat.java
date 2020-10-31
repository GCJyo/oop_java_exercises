package com.techreturners.cats;

//call WildCat constructor
public class DomesticCat extends AbstractCat {
    public DomesticCat() {
        super(false, "Purrrrrrr", false, 23, "domestic");
    }

    //in case the cat is full the sound should be diffirent
    public String isFull() {
        super.SetEat("miow");
        return super.eat();
    }

    //in case the cat is bit bigger or smaller than avarage
    public void setHeight(int height) {
        super.Setheight(height);
    }
}
