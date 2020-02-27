package com.techlabs.employee.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LoadFromFile implements ILoadable {

	List<String> lines;

	public LoadFromFile() {
		lines = new ArrayList<String>();
	}

	@SuppressWarnings("finally")
	@Override
	public List<String> loadEmployeeDetails() {

		File file = new File("employee data.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String line = null;

			while ((line = br.readLine()) != null) {
				lines.add(line);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found");
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			return lines;
		}
	}
}
