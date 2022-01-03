package org.EngDrom.utils.addedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class AddedList<E> implements List {

	private LinkedList< List<E> > lists = new LinkedList< List<E> >();
	private int length = 0;
	
	@Override
	public boolean add(Object arg0) { return false; }
	@Override
	public void add(int arg0, Object arg1) { }
	@Override
	public boolean addAll(Collection arg0) { return false; }
	@Override
	public boolean addAll(int arg0, Collection arg1) {return false;}

	@Override
	public void clear() {
		lists.clear();
		length = 0;
	}

	// TODO
	@Override
	public boolean contains(Object arg0) { return false; }

	@Override
	public boolean containsAll(Collection arg0) { return false; }

	@Override
	public Object get(int pos) {
		if (pos >= length || pos < 0)
			return null;
		
		int current_sublist = 0;
		for (List<E> es:lists) {
			if (es.size() > pos)
				return es.get(pos);
			pos -= es.size();
		}
		
		return null;
	}

	@Override
	public int indexOf(Object arg0) {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return this.length == 0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int pos, Object element) {
		if (pos >= length || pos < 0)
			return null;
		
		int current_sublist = 0;
		for (List<E> es:lists) {
			if (es.size() > pos)
				return es.set(pos, (E) element);
			pos -= es.size();
		}
		return null;
	}

	@Override
	public int size() {
		return this.length;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

}
