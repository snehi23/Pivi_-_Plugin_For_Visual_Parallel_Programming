package asu.ser.capstone.pivi.test;

public class Solution {
	public static void main(String[] args) {
		checkEvenOdd();
	}

	public static void checkEvenOdd() {
		int a = 6;
		while (a > 0) {
			if (a % 2 == 0) {
				System.out.println(a + " is even.");
			} else {
				System.out.println(a + " is odd.");
			}
			a--;
		}
	}
}
