package com.hashtable;

public class MyBinaryNode<K extends Comparable> {

	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;	
	
	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
