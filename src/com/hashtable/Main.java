package com.hashtable;

public class Main {

	public static void main(String[] args) {
		String str = "Paranoids are not paranoid"
				+ " because they are paranoid but"
				+ " because they keep putting themselves "
				+ "deliberately into paranoid avoidable situations";
		String arr[] = str.split(" ");
		LinkedHashMap<String,Integer> hashMap = new LinkedHashMap<>();
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
	 int frequency = hashMap.get("paranoid");
	 System.out.println(frequency);
	}

}
