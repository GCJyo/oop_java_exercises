package com.techreturners.cats;
	public class DomesticCat extends WildCat {
		public DomesticCat() {
			//call WildCat constructor
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
