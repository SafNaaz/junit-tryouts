package com.string;

public class Demo {

	public boolean compareString(String first, String second) {
		return first.equalsIgnoreCase(second) ? true : false;
	}

	public String concatString(String first, String second) {
		return first.concat(second);
	}

	public int[] addOneToArray(int[] numbers) {
		int length = numbers.length;
		int output[] = new int[length];
		for (int i = 0; i < length; i++) {
			output[i] = numbers[i]+1;
		}
		return output;
	}
	
	public void performamnce(){
		for(int i=0; i<1000000000; i++){
			
		}
		System.out.println("**finish**");
	}
	
	public void exception(int number){
		int result = 10/number;
		System.out.println("Result :"+result);
	}
}
