package com.techlabs.dependency.weak;

public class LoadFromUrl implements ILoadable {

	@Override
	public String load() {
		String loadedFrom = "Url";
		return loadedFrom;
	}
}
