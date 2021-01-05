package main.java.characterCreator.characters;

import main.java.characterCreator.weaponBehaviors.WeaponBehavior;

public class Troll extends Character {

	public Troll() {
		super();
	}
	
	public Troll(WeaponBehavior weapon) {
		setWeapon(weapon);
	}

	@Override
	public void fight() {
		System.out.println("Troll attacks with: " + getWeapon());
		this.weapon.useWeapon();
	}

}
