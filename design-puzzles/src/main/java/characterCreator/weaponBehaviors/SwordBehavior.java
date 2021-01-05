package main.java.characterCreator.weaponBehaviors;

public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Sword deals 5 damage!");
	}
	
	@Override
	public String toString() {
		return "Sword";
	}

}
