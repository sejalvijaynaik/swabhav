package com.techlabs.log;

import java.io.*;

public class LogErrorFindTest {
	public static void main(String[] args) throws IOException {

		String flagInFile = null;
		if(args.length == 0) {
			printMessage(flagInFile);
			return;
		}
		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-e")) {
				flagInFile = "ERROR";
				printMessage(flagInFile);
			}
			else if (args[i].equals("-i")) {
				flagInFile = "INFO";
				printMessage(flagInFile);
			}
			else if (args[i].equals("-w")) {
				flagInFile = "WARNING";
				printMessage(flagInFile);
			}
		}
	}

	private static void printMessage(String flagInFile) throws IOException {
		String line;

		File file = new File("db_app.log");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);

		while ((line = br.readLine()) != null) {
			String splitString[] = line.split(" - ");
			if(flagInFile == null) {
				System.out.println(line);
				continue;
			}
			if (splitString[1].equals(flagInFile)) {
				System.out.println(line);
			}
		}
		br.close();
		fileReader.close();
	}
}
