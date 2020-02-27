package com.techlabs.employee.loader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoadFromUrl implements ILoadable {

	List<String> lines;

	public LoadFromUrl() {
		lines = new ArrayList<String>();
	}

	@SuppressWarnings("finally")
	@Override
	public List<String> loadEmployeeDetails() {

		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(new URL("https://swabhav-tech.firebaseapp.com/emp.txt").openStream()))) {

			String line;
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			return lines;
		}
	}
}
