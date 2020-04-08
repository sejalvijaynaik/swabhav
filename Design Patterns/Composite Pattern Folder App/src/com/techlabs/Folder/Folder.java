package com.techlabs.Folder;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.file.File;
import com.techlabs.istorable.IStorable;

public class Folder implements IStorable {

	private String name;
	private List<IStorable> children = new ArrayList<IStorable>();

	public Folder(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addChildren(IStorable iStorable) {
		children.add(iStorable);
	}

	@Override
	public void display(StringBuilder dashes) {

		StringBuilder dashesLocal = new StringBuilder(dashes);
		System.out.println(dashesLocal + name);
		dashesLocal.append("-");
		
		if(children.size() !=0) {
			for(IStorable tempIStorable : children) {
				if(tempIStorable instanceof File) {
					File file = (File)tempIStorable;
					file.display(dashesLocal);
				}
				
				else if (tempIStorable instanceof Folder) {
					Folder folder = (Folder)tempIStorable;
					folder.display(dashesLocal);
				}
			}
		}
	}
}