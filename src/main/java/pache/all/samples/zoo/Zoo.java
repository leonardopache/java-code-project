/**
 * 
 */
package pache.all.samples.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Clas responsible for operate the Zoo actions.
 * 
 * @author lmarquespache
 *
 */
public class Zoo {
	private static List<Animal> zooAnimalsList;
	
	public Zoo() {
		zooAnimalsList = new ArrayList<>();
	}
	
	public void createDummyZoo() {
		zooAnimalsList = new ArrayList<>();
		String[] foods = new String[] { "Meet", "Corn", "Fresh meat" };
		Random randon = new Random();

		this.insertAnimal(new Dog("Killian", foods[randon.nextInt(foods.length)], "Hunting dog"));
		this.insertAnimal(new Dog("Rocky", foods[randon.nextInt(foods.length)], "Guard dog"));
		this.insertAnimal(new Dog("Peter", foods[randon.nextInt(foods.length)], "Hunting dog"));
		this.insertAnimal(new Chicken("KFC one", foods[randon.nextInt(foods.length)], 0.75d, false));
		this.insertAnimal(new Chicken("Rock", foods[randon.nextInt(foods.length)], 0.75d, false));
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
				if(!animal.getFriends().contains(zooAnimalsList.get(position))) {
					animal.createFriendship(zooAnimalsList.get(position));
				}
			} else {
				if(animal.getFriends().contains(zooAnimalsList.get(position))) {
					animal.removeFriendship(zooAnimalsList.get(position));
				}
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
