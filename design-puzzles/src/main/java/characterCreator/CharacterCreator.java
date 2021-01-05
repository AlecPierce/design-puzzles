package main.java.characterCreator;

import main.java.characterCreator.characters.*;
import main.java.characterCreator.weaponBehaviors.*;

public final class CharacterCreator {
	
	static AxeBehavior axe = new AxeBehavior();
	static BowAndArrowBehavior bow = new BowAndArrowBehavior();
	static EmptyHandedBehavior empty = new EmptyHandedBehavior();
	static KnifeBehavior knife = new KnifeBehavior();
	static SwordBehavior sword = new SwordBehavior();

	public static void main(String[] args) {
		King king = new King();
		king.fight();
		king.setWeapon(sword);
		king.fight();
		
		Queen queen = new Queen();
		queen.fight();
		queen.setWeapon(axe);
		queen.fight();
		
		Knight knight = new Knight();
		knight.fight();
		knight.setWeapon(bow);
		knight.fight();
		
		Troll troll = new Troll();
		troll.fight();
		troll.setWeapon(knife);
		troll.fight();
	}

}
