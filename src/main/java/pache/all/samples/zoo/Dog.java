package pache.all.samples.zoo;

import java.util.stream.Collectors;

public class Dog extends Animal {
	private String dogType;

	public Dog(String name, String food, String type) {
		this.name = name;
		this.favoriteFood = food;
		this.dogType = type;
	}

	@Override
	protected String getFavoriteFood() {
		return favoriteFood;
	}

	@Override
	protected String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Dog [food=" + getFavoriteFood() + ", name=" + getName() + ", dogType=" + dogType + ", friends=["
				+ friends.stream().map(Animal::getName).collect(Collectors.joining(", ")) + "]]";
	}

}
