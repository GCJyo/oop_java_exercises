package com.techreturners.cats;
public class LionCat implements Cat{
    boolean sleep=false;
    String eat;
    boolean run=false;
    int  height=1100;
    String  catSetting="Lion";
public void goToSleep(){
    this.sleep=true;
}
public void wakeUp(){
    this.sleep=false;
}
public boolean isAsleep(){
    return this.sleep;
}
public String eat(){
    return this.eat="Roar!!!!";
};
//in case the Lioncat is full the sound should be different
public String isFull(){
    return this.eat="miow";
}
public boolean run(){
  return this.run=true;
}
public String getSetting(){
    return this.catSetting;
}
public int getHeight(){
 return this.height;
}
//in case the Lioncat is bit bigger or smaller than average
public void setHeight(int height){
this.height = height;
}
//get average height of a domestic cat
public int getAverageHeight(){
 return 23;
}



}
