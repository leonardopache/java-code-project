/**
 * 
 */
package pache.all.samples.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class responsible for define common animal behavior.
 *  
 * @author lmarquespache
 */
public abstract class Animal {

	protected String name;
	protected String favoriteFood;

	private List<Animal> friends = new ArrayList<>();

	protected abstract String getFavoriteFood();

	protected abstract String getName();

	protected void createFriendship(Animal friend) {
		if (!friends.contains(friend) && !this.equals(friend)) {
			friend.friends.add(this);
			friends.add(friend);
			logDayLiveChanges(this, friend, true);
		}
	}

	protected void removeFriendship(Animal friend) {
		if (friends.contains(friend)) {
			friend.friends.remove(this);
			friends.remove(friend);
			logDayLiveChanges(this, friend, false);
		}
	}

	protected List<Animal> getFriends() {
		return friends;
	}

	private void logDayLiveChanges(Animal a1, Animal a2, boolean createFriendship) {

		if (createFriendship) {
			System.out.println(String.format("(%s) %s has establishes friendship with (%s) %s",
					a1.getClass().getSimpleName(), a1.getName(), a2.getClass().getSimpleName(), a2.getName()));
		} else {
			System.out.println(String.format("(%s) %s has lost friendship with (%s) %s", a1.getClass().getSimpleName(),
					a1.getName(), a2.getClass().getSimpleName(), a2.getName()));
		}
	}
}
