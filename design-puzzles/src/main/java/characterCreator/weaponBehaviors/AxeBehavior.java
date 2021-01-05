package main.java.characterCreator.weaponBehaviors;

public class AxeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("Axe deals 6 damage!");
	}
	
	@Override
	public String toString() {
		return "Axe";
	}

}
