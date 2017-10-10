package gear;

import item.Item;

public class Weapon extends Item{
	
	int GearLevel;
	int Damage;

	public Weapon(int level, String itemName) {
		super(itemName);
		this.GearLevel = level;
	}
	
	public Weapon(int level, int damage, String itemName) {
		super(itemName);
		this.GearLevel = level;
		this.Damage = damage;
	}
	
	public Weapon(int level, String itemName, String itemLore) {
		super(itemName, itemLore);
		this.GearLevel = level;
	}
	
	public Weapon(int level, int damage, String itemName, String itemLore) {
		super(itemName, itemLore);
		this.GearLevel = level;
		this.Damage = damage;
	}
}
