/**
 * 
 */
package pache.all.samples.zoo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lmarquespache
 *
 */
public abstract class Animal {
	
	protected String name;
	protected String favoriteFood;
	
	private List<Animal> friends = new ArrayList<>();

	protected abstract String getFavoriteFood();

	protected abstract String getName();

	protected void createFriendship(Animal friend) {
		if(!friends.contains(friend) && !this.equals(friend)) {
			friend.friends.add(this);
			friends.add(friend);
		}
	}
	
	protected void removeFriendship(Animal friend) {
		if(friends.contains(friend)) {
			friend.friends.remove(this);
			friends.remove(friend);
		}
	}
	
	protected List<Animal> getFriends(){
		return friends;
	}
	
}
