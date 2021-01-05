package main.java.characterCreator.characters;

import main.java.characterCreator.weaponBehaviors.*;

public abstract class Character {
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public Character() {
		EmptyHandedBehavior emptyHanded = new EmptyHandedBehavior();
		setWeapon(emptyHanded);
	}
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
	
	public WeaponBehavior getWeapon() {
		return this.weapon;
	}
}
