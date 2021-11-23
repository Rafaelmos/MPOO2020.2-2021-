package model;

import java.util.Observable;

public abstract class Model extends Observable {

	public void notify(Object object) {
		setChanged();
		notifyObservers(object);
	}

}

