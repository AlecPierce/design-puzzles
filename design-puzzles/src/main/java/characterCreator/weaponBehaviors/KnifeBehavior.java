package main.java.characterCreator.weaponBehaviors;

public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Knife deals 4 damage!");
	}
	
	@Override
	public String toString() {
		return "Knife";
	}

}
