package com.file;

import java.io.*;

public class FileWriteUsingFileWriter {
	public static void main(String[] args) {
		String line;
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("iAmNewFile.txt")))) {
			for (int i = 1; i <= 10; i++) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(BufferedReader br = new BufferedReader(new FileReader(new File("iAmNewFile.txt")))){
			int sum = 0, num=0;
			while((line=br.readLine()) != null) {
				System.out.println(line);
				num = Integer.parseInt(line);
				sum = sum + num;
			}
			System.out.println(sum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
