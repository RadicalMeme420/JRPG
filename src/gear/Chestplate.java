package gear;

public class Chestplate extends Armor{

	double Health;
	
	public Chestplate(int level, double itemHealth, String itemName) {
		super(level, itemName);
		this.Health = itemHealth;
	}
	
	public Chestplate(int level, double itemHealth, String itemName, String itemLore) {
		super(level, itemName, itemLore);
		this.Health = itemHealth;

	}

}
