package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm extends Animal {
	public static void main(String[] args) {
		Animal chicken = new Chicken();
		Animal geese = new Geese();
		Animal pig = new Pig();
		Animal cow = new Cow();
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(chicken);
		farm.add(pig);
		farm.add(geese);
		farm.add(cow);
		farm.add(chicken);
		farm.add(pig);
		for (int i = 0; i < farm.size(); i++) {
			chicken.makeNoise();
			chicken.annoyFarmer();
			pig.makeNoise();
			pig.annoyFarmer();
			geese.makeNoise();
			geese.annoyFarmer();
			cow.makeNoise();
			cow.annoyFarmer();
		}
	}

	@Override
	String makeNoise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String annoyFarmer() {
		// TODO Auto-generated method stub
		return null;
	}

}
