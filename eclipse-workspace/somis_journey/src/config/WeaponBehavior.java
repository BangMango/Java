package config;

public interface WeaponBehavior {
	public <T> void setWeapon(T weapon);
	public void invokeWeaponSkill();
}
