package model;

import java.util.Comparator;

public class SortByDogBirthDate implements Comparator<Doggie> {

	@Override
	public int compare(Doggie o1, Doggie o2) {
		// TODO Auto-generated method stub
		return o1.getBirthDate()-o2.getBirthDate();
	}

}
