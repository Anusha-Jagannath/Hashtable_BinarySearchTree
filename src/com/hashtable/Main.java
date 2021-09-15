package com.hashtable;

public class Main {

	public static void main(String[] args) {
		String str = "Paranoids are not paranoid" + " because they are paranoid but"
				+ " because they keep putting themselves " + "deliberately into paranoid avoidable situations";
		String arr[] = str.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<>();
		for (String string : arr) {

			Integer value = hashMap.get(string);
			if (value != null) {
				value += 1;
			} else {
				value = 1;
			}
			hashMap.add(string, value);
		}
		System.out.println(hashMap);
		int frequency = hashMap.get("Paranoids");
		System.out.println(frequency);
		hashMap.deleteWord("avoidable", 1);
		System.out.println(hashMap);

		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
		//adding more element as specified
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		int size = myBinaryTree.getSize();
		System.out.println("Size of binary search tree " + size);
	}

}
