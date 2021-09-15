package com.hashtable;

public class Main {

	public static void main(String[] args) {
		String str = "To be or not to be";
		String arr[] = str.split(" ");
		HashMap<String,Integer> hashMap = new HashMap<>();
		for(String string: arr) {
		
			Integer value = hashMap.get(string);
			if(value != null) {
				value+=1;
			}
			else {
				value = 1;
			}
			hashMap.add(string, value);
		}
	 System.out.println(hashMap);
	}

}
