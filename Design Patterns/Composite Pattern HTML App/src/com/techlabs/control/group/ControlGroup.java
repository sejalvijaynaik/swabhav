package com.techlabs.control.group;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.ihtmlelement.IHTMLElement;

public class ControlGroup implements IHTMLElement {

	private String tag;
	private List<IHTMLElement> elements = new ArrayList<IHTMLElement>();
	private StringBuilder str = new StringBuilder();

	public ControlGroup(String tag) {
		this.tag = tag;
	}

	public void addElement(IHTMLElement ihtmlElement) {
		elements.add(ihtmlElement);
	}

	@Override
	public StringBuilder parseHTML() {

		str.append("<" + tag + ">\n");
		if (elements != null) {
			for (IHTMLElement ihtmlElement : elements) {
				str.append(ihtmlElement.parseHTML());
			}
		}
		str.append("</" + tag + ">\n");
		return str;
	}
}
