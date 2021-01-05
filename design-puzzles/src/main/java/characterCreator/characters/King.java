package main.java.characterCreator.characters;

import main.java.characterCreator.weaponBehaviors.WeaponBehavior;

public class King extends Character {
	
	public King() {
		super();
	}
	
	public King(WeaponBehavior weapon) {
		setWeapon(weapon);
	}

	@Override
	public void fight() {
		System.out.println("King attacks with: " + getWeapon());
		this.weapon.useWeapon();
	}

}
