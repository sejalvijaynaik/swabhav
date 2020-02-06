package com.headfirst.chapter2;

public class DrumKitTestDrive {
	 public static void main(String [] args) {
		 DrumKit d = new DrumKit();
		 d.playSnare();
	//	 d.playSnare();
		 d.playTopHat();

		 d.snare = false;
		 if (d.snare == false) {        
		 d.playSnare();
	//		 d.playTopHat();
			 d.playTopHat();
			 }
	 }
}
