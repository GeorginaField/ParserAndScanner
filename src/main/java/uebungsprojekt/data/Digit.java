package uebungsprojekt.data;

import uebungsprojekt.abiturklassen.ComparableContent;

public class Digit implements ComparableContent<Digit> {

	private final int number;

	public Digit(int number){
		this.number = number;
	}

	//ToDo BinarySearchTree 1: vervollständige die Methoden
	@Override
	public boolean isGreater(Digit pContent) {
		return number > pContent.getNumber();
	}

	@Override
	public boolean isEqual(Digit pContent) {
		return number == pContent.getNumber();
	}

	@Override
	public boolean isLess(Digit pContent) {
		return number < pContent.getNumber();
	}

	public int getNumber() {
		return number;
	}
}
