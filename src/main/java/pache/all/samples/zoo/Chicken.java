/**
 * 
 */
package pache.all.samples.zoo;

import java.util.stream.Collectors;

/**
 * @author lmarquespache
 *
 */
public class Chicken extends Animal {
	
	private double lengthWings;
	private boolean broiler;

	public Chicken(String name, String food, double lengthWings, boolean broiler) {
		this.name = name;
		this.favoriteFood = food;
		this.lengthWings = lengthWings;
		this.broiler = broiler;
	}

	@Override
	protected String getFavoriteFood() {
		return favoriteFood;
	}

	@Override
	protected String getName() {
		return name;
	}
	
	public boolean isBroiler() {
		return broiler;
	}
	
	public double getLengthWings() {
		return lengthWings;
	}

	@Override
	public String toString() {
		return "Chicken [lengthWings=" + getLengthWings() + ", broiler=" + isBroiler() + ", name=" + getName() + ", favoriteFood="
				+ getFavoriteFood() + ", friends=["+ friends.stream().map(Animal::getName).collect(Collectors.joining(", ")) + "]]";
	}
	
	
}
