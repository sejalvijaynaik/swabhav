package com.techlabs.control;

import com.techlabs.ihtmlelement.IHTMLElement;

public class Control implements IHTMLElement {

	private String tag;
	private String type;
	private String value;

	public Control(String tag, String type, String value) {
		this.tag = tag;
		this.type = type;
		this.value = value;
	}

	public Control(String tag) {
		this.tag = tag;
	}

	private StringBuilder str = new StringBuilder();

	@Override
	public StringBuilder parseHTML() {

		if (type != null) {
			str.append("<" + tag + " type = " + type + " value = " + value + ">" + "</" + tag + ">\n");
			return str;
		}
		str.append("<" + tag + ">" + "</" + tag + ">\n");
		return str;
	}
}
