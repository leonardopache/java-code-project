package pache.oo.generics.i;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements IList<T>{

	private final List<T> list = new ArrayList<>();
	
	@Override
	public synchronized List<T> getList() {
		return list;
	}
}
