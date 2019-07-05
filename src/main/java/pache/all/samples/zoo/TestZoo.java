package pache.all.samples.zoo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class TestZoo {
	private Zoo zoo;

	@Before
	public void setUp() {
		zoo = new Zoo();
		createZoo();
	}

	@Test
	public void testOpenZoo() {
		zoo.showZoo();
		assertThat(zoo.numberOfAnimalsInZoo() > 0, is(true));
	}

	@Test
	public void testItselfFriendship() {
		int friendsBefore = zoo.getAnimalList().get(1).getFriends().size();
		zoo.getAnimalList().get(1).createFriendship(zoo.getAnimalList().get(1));
		int friendsAfter = zoo.getAnimalList().get(1).getFriends().size();
		assertThat(friendsBefore == friendsAfter, is(true));
	}

	@Test
	public void testBidirectionalFriendship() {
		Animal me = zoo.getAnimalList().get(4);
		Animal he = zoo.getAnimalList().get(2);
		me.createFriendship(he);
		assertThat(he.getFriends().contains(me), is(true));
	}
	
	@Test
	public void testCreateFriendship() {
		Animal me = zoo.getAnimalList().get(4);
		Animal he = zoo.getAnimalList().get(2);
		int friendsBefore = me.getFriends().size();
		me.createFriendship(he);
		assertThat(me.getFriends().size() > friendsBefore , is(true));
	}
	
	@Test
	public void testRemoveFriendship() {
		Animal me = zoo.getAnimalList().get(4);
		Animal he = zoo.getAnimalList().get(2);
		me.createFriendship(he);
		me.removeFriendship(he);
		assertThat(!me.getFriends().contains(he) , is(true));
		assertThat(!he.getFriends().contains(me) , is(true));
	}

	@Test
	public void testLiveOneDay() {
		zoo.liveOneDay();
		
	}
	
	private void createZoo() {
		String[] foods = new String[] { "Meet", "Corn", "Fresh meat" };
		Random randon = new Random();

		zoo.insertAnimal(new Dog("Killian", foods[randon.nextInt(foods.length)], "Hunting dog"));
		zoo.insertAnimal(new Dog("Rocky", foods[randon.nextInt(foods.length)], "Guard dog"));
		zoo.insertAnimal(new Dog("Peter", foods[randon.nextInt(foods.length)], "Hunting dog"));
		zoo.insertAnimal(new Chicken("KFC one", foods[randon.nextInt(foods.length)], 0.75d, false));
		zoo.insertAnimal(new Chicken("Rock", foods[randon.nextInt(foods.length)], 0.75d, false));
//		zoo.insertAnimal();
		
		zoo.getAnimalList().get(0).createFriendship(zoo.getAnimalList().get(1));
		zoo.getAnimalList().get(2).createFriendship(zoo.getAnimalList().get(3));
		zoo.getAnimalList().get(zoo.getAnimalList().size()-1).createFriendship(zoo.getAnimalList().get(0));

	}

}
