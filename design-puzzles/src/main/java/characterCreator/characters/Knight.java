package main.java.characterCreator.characters;

import main.java.characterCreator.weaponBehaviors.WeaponBehavior;

public class Knight extends Character {

	public Knight() {
		super();
	}
	
	public Knight(WeaponBehavior weapon) {
		setWeapon(weapon);
	}

	@Override
	public void fight() {
		System.out.println("Knight attacks with: " + getWeapon());
		this.weapon.useWeapon();
	}

}
