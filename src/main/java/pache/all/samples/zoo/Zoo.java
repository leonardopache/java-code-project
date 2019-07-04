/**
 * 
 */
package pache.all.samples.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author lmarquespache
 *
 */
public class Zoo {
	private static List<Animal> zooAnimalsList;
	
	public Zoo() {
		zooAnimalsList = new ArrayList<>();
//
//		String[] names = new String[] { "P. One", "P. Two", "Killian" };
//		String[] foods = new String[] { "Meet", "Corn", "Fresh meat" };
//		Random random = new Random();
//		zooAnimalsList
//				.add(new Dog(names[random.nextInt(names.length)], foods[random.nextInt(foods.length)], "Hunting dog"));
//		zooAnimalsList
//				.add(new Dog(names[random.nextInt(names.length)], foods[random.nextInt(foods.length)], "Guard dog"));
//		zooAnimalsList
//				.add(new Dog(names[random.nextInt(names.length)], foods[random.nextInt(foods.length)], "Hunting dog"));
//		zooAnimalsList
//				.add(new Dog(names[random.nextInt(names.length)], foods[random.nextInt(foods.length)], "Inndor dog"));
//		zooAnimalsList.add(
//				new Chicken(names[random.nextInt(names.length)], foods[random.nextInt(foods.length)], 0.75d, false));
	}

	public void showZoo() {
		zooAnimalsList.stream().forEach(System.out::println);
	}
	
	public void liveOneDay() {
		Random random = new Random();
		for (Animal animal : zooAnimalsList) {
			int position = random.nextInt(zooAnimalsList.size());
			boolean action = random.nextBoolean();

			if(action) {
				animal.createFriendship(zooAnimalsList.get(position));
			} else {
				animal.removeFriendship(zooAnimalsList.get(position));
			}
		}
	}

	public void insertAnimal(Animal animal) {
		zooAnimalsList.add(animal);
	}

	public int numberOfAnimalsInZoo() {
		return zooAnimalsList.size();
	}

	public List<Animal> getAnimalList() {
		return Collections.unmodifiableList(zooAnimalsList);
	}
}
