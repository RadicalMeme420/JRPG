package gear;

import item.Item;

public class Armor extends Item {
	
	int GearLevel;
	int Health;
	
	public Armor(int level, String itemName) {
		super(itemName);
		GearLevel = level;
		
	}
	
	public Armor(int level, int health, String itemName) {
		super(itemName);
		GearLevel = level;
		Health = health;
	}
	
	public Armor(int level, String itemName, String itemLore) {
		super(itemName, itemLore);
		GearLevel = level;
		
	}
	
	public Armor(int level, int health, String itemName, String itemLore) {
		super(itemName, itemLore);
		GearLevel = level;
		Health = health;
	}
}
