package main.java.characterCreator.characters;

import main.java.characterCreator.weaponBehaviors.WeaponBehavior;

public class Queen extends Character {

	public Queen() {
		super();
	}
	
	public Queen(WeaponBehavior weapon) {
		setWeapon(weapon);
	}

	@Override
	public void fight() {
		System.out.println("Queen attacks with: " + getWeapon());
		this.weapon.useWeapon();
	}
}
