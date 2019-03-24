package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		Animal chicken=new Chicken();
		Animal geese=new Geese();
		Animal pig=new Pig();
		Animal cow=new Cow();
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(chicken);
		farm.add(pig);
		farm.add(geese);
		farm.add(cow);
	}
}
