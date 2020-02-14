package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadUsingScanner {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(new File("hello.txt"))) {
			while(sc.hasNext()) {
			System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
	}
}
