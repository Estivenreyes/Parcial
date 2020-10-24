package model;

import java.util.Comparator;

public class SortByDogAge implements Comparator<Doggie>{

	@Override
	public int compare(Doggie o1, Doggie o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

}
