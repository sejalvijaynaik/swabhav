package com.techlabs.manchild.test;

import com.techlabs.child.Child;
import com.techlabs.iemotionable.IEmotionable;
import com.techlabs.isocializable.ISocializable;
import com.techlabs.man.Man;

public class ManChildTest {
	
	public static void main(String[] args) {
		
		//Man man = new Man();
		//Child child = new Child();
		
		IEmotionable manEmo = new Man();
		IEmotionable childEmo = new Child();
		
		ISocializable manSocial = new Man();
		
		//emotions(man);
		//emotions(child);
		emotions(manEmo);
		emotions(childEmo);
		
		//walkingInGarden(man);
		walkingInGarden(manSocial);
	}
	
	public static void emotions(IEmotionable iEmotionable) {
		iEmotionable.wish();
		iEmotionable.bye();
	}
	
	public static void walkingInGarden(ISocializable iSocializable) {
		iSocializable.greet();
	}
}
