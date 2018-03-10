package pache.oo.generics.i;

public class MainTest {

	public static void main(String[] args) {
		IList<String> listStr = new MyList<>();
		IList<Integer> listInt = new MyList<>();
		listStr.getList().add("Leo");
		listInt.getList().add(13);
	}

}
