package com.hashtable;

public class MyBinaryTree<K extends Comparable<K>> {

	public MyBinaryNode<K> root;

	/*
	 * The method adds an element to the BST calls a method addElementRecursively to
	 * perform the insertion operation
	 */
	public void add(K key) {
		this.root = this.addElementRecursively(root, key);
	}

	/*
	 * The method addElementRecursively makes use of recursion to insert a node
	 * takes parameters root node and the user input from the method addElement
	 * makes use of compareTo to compare the user input and then places it to the
	 * left or right subtree accordingly
	 * 
	 * @returns the currentNode.
	 */
	public MyBinaryNode<K> addElementRecursively(MyBinaryNode<K> currentNode, K key) {
		if (currentNode == null)
			return new MyBinaryNode<>(key);
		int compareResult = ((Comparable<K>) key).compareTo(currentNode.key);
		if (compareResult == 0)
			return currentNode;
		if (compareResult < 0) {
			currentNode.left = addElementRecursively(currentNode.left, key);
		} else {
			currentNode.right = addElementRecursively(currentNode.right, key);
		}
		return currentNode;
	}

	/*
	 * The method getSize is used to get the size of the BST It calls another method
	 * getSizeUsingRecursive which actually calculates the size
	 * 
	 * @returns the size of BST - integer value
	 */
	public int getSize() {
		return this.getSizeUsingRecursive(root);
	}

	/*
	 * The method getSizeUsingRecursive takes in the parameter currentNode
	 * recursively calculates the size of the tree
	 * 
	 * @returns size of the Binary search tree
	 */
	private int getSizeUsingRecursive(MyBinaryNode<K> currentNode) {
		return (currentNode == null ? 0
				: 1 + this.getSizeUsingRecursive(currentNode.left) + this.getSizeUsingRecursive(currentNode.right));
	}

	/*
	 * The method searchElement is used to search for a particular element in the
	 * BST
	 * 
	 * @param data is the element to be searched The method calls another method
	 * searchNodes
	 */
	public void searchElement(K data) {
		this.searchData(data, root);
	}

	/*
	 * method used to search the specified element
	 * 
	 * @param takes root node and element be be searched recursively performs
	 * searching either to left or to right until specified element is found
	 */
	private void searchData(K data, MyBinaryNode<K> root) {
		if (root == null) {
			System.out.println("The element you are searching is not found.");
			return;
		}
		int result = data.compareTo(root.key);
		if (result == 0)
			System.out.println("The element " + data + " is found in this BST.");
		else if (result < 0)
			searchData(data, root.left);
		else
			searchData(data, root.right);
	}

}
