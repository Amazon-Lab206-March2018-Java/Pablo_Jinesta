package com.esppablo.objectmasterparttwo;
import com.esppablo.objectmasterpartone.*;

public class Test {

	public static void main(String[] args) {
		Human human = new Human();
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja();
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		
		// Story:
		System.out.println("A dude and his friend show up at the wrong place...");
		System.out.println("There is a ninja and " + samurai1.howMany() + " samurais.");
	
		// Status:
		System.out.println("\n- Health Status:");
		System.out.println("Human Health Level: " + human.health);
		System.out.println("Wizard Health Level: " + wizard.health);
		System.out.println("Ninja Health Level: " + ninja.health);
		System.out.println("Samurai1 Health Level: " + samurai1.health);
		System.out.println("Samurai2 Health Level: " + samurai2.health);
		
		// Fight
		System.out.println("\n\n- Human tells a really bad joke about ninjas...");
		
		// Ninja Attack: that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
		System.out.println("The ninja didn't like it and hits the dude...");
		ninja.steal(human);
		
		// Wizard Attack: fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
		System.out.println("His friend goes crazy and attacks the ninja with some crazy \"wizard\" powers...");
		wizard.fireball(ninja);
		
		// Wizard Heals: heals the other human by the wizard's intelligence
		System.out.println("Then uses his amazing \"wizard\" powers to heal the dude...");
		wizard.heal(human);
		
		// Ninja: decreases their health by 10
		System.out.println("Ninja is scared of magic and runs away LOL");
		ninja.runAway(); 

		// Samurai Attack: that kills the other human, but reduces the Samurai's health by half
		System.out.println("One of the samurais is not impressed of magic, but, she doesn't really get along with wizards, so, she punches the wizard so hard... the wizard died 0_0 ");
		samurai2.deathBlow(wizard);
		
		// Samurai Mediates: heals the Samurai for half of their current health
		System.out.println("She then sits down to medidate to recover her energy a little bit.");
		samurai2.meditate();
		
		// Conclusion:
		System.out.println("Samurais are savage... Don't mess with samurais...");		
		
		// The end
		System.out.println("\n");

		// Status:
		System.out.println("- Health Status:");
		System.out.println("Human Health Level: " + human.health);
		System.out.println("Ninja Health Level: " + ninja.health);
		System.out.println("Wizard Health Level: " + wizard.health);
		System.out.println("Samurai1 Health Level: " + samurai1.health);
		System.out.println("Samurai2 Health Level: " + samurai2.health);


	}

}
