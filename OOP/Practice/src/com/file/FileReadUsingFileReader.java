package com.file;

import java.io.*;

public class FileReadUsingFileReader {
	public static void main(String[] args) {
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader(new File("hello.txt")))){
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
