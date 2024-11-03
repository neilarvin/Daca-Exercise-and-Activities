package Daca_L13Activity1;

import Daca_L13Activity1.Dog.Size;

public class Main {

	public static void main(String[] args) {
	
		Dog smallDog = new Dog(Size.SMALL);
		Dog mediumDog = new Dog(Size.MEDIUM);
		Dog largeDog = new Dog(Size.LARGE);
		Dog extralargeDog = new Dog(Size.XLARGE);
		Dog tinyDog = new Dog(Size.TINY);
		
		smallDog.selectDogSize();
		mediumDog.selectDogSize();
		largeDog.selectDogSize();
		extralargeDog.selectDogSize();
		tinyDog.selectDogSize();

	}

}
