package _01_AnimalFarm;

abstract class Animal {
	
	abstract String makeNoise();

	abstract String annoyFarmer();
}

class Chicken extends Animal {
	
	@Override
	String makeNoise() {
		
		return "bawk";
	}

	@Override
	String annoyFarmer() {
		
		return "stupid chicken";
	}
}

class Cow extends Animal {
	

	@Override
	String makeNoise() {
		
		return "moo";
	}

	@Override
	String annoyFarmer() {
		
		return "Too much methane in the atmosphere";
	}
}

class Pig extends Animal {
	

	@Override
	String makeNoise() {
		
		return "oink";
	}

	@Override
	String annoyFarmer() {
		
		return "phat";
	}
}

class Geese extends Animal {
	
	@Override
	String makeNoise() {
		
		return "honk";
	}

	@Override
	String annoyFarmer() {
		
		return "this is clearly a turkey";
	}
}