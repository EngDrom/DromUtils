package org.EngDrom.utils.hashtree;

import java.util.LinkedList;

class HashTreeElement<E> {

	private HashTreeElement<E> left;
	private HashTreeElement<E> right;
	
	private LinkedList<E> items;
	
	public LinkedList<E> get_items () {
		return items;
	}
	
}
