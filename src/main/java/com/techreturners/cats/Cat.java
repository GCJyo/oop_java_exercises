package com.techreturners.cats;

public interface Cat {
  	  //cat sleep status
  	  public void goToSleep();
  	  public void wakeUp();
  	  public boolean isAsleep();
  	  //return is cat eating
  	  public String eat();
  	  // get cat's type and height
  	  public String getSetting();
  	  public int getAverageHeight();
  	}
