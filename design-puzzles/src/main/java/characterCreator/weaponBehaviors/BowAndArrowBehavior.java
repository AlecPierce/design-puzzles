package main.java.characterCreator.weaponBehaviors;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Bow and Arrow deals 3 damage!");
	}
	
	@Override
	public String toString() {
		return "Bow and Arrow";
	}

}
