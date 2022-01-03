package org.EngDrom.utils.tree;

public class Tree<E> {
	
	private TreeElement<E> root;

	public TreeElement<E> getRoot () {
		return root;
	}
	
	public TreeElement<E> getChild (TreeElement<E> el, int idx) {
		return el.childs.get(idx);
	}
	
	public int getChildCount (TreeElement<E> el) {
		return el.childs.size();
	}
	
	public boolean isLeaf (TreeElement<E> el) {
		return true;
	}
	
	public int getIndexOfChild (TreeElement<E> parent, TreeElement<E> child) {
		return parent.childs.indexOf(child);
	}
	
}
