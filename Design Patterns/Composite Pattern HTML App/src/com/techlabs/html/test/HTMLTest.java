package com.techlabs.html.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.techlabs.control.Control;
import com.techlabs.control.group.ControlGroup;

public class HTMLTest {
	public static void main(String[] args) throws IOException {

		ControlGroup html = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");
		ControlGroup p1 = new ControlGroup("p");
		ControlGroup p2 = new ControlGroup("p");
		ControlGroup p3 = new ControlGroup("p");
		Control span1 = new Control("span");
		Control span2 = new Control("span");
		Control input1 = new Control("input", "text", "first name");
		Control input2 = new Control("input", "type", "pasword");
		Control input3 = new Control("input", "submit", "login");

		p1.addElement(span1);
		p1.addElement(input1);
		p2.addElement(span2);
		p2.addElement(input2);
		p3.addElement(input3);
		div.addElement(p1);
		div.addElement(p2);
		div.addElement(p3);
		body.addElement(div);
		html.addElement(body);

		File file = new File("elements.html");
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(html.parseHTML().toString());
		fileWriter.close();
	}
}
