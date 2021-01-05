package main.java.characterCreator.weaponBehaviors;

public class EmptyHandedBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Empty-Handed deals 1 damage!");
	}
	
	@Override
	public String toString() {
		return "Empty-Handed";
	}

}
