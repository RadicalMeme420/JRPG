package gear;

public class Boots extends Armor{

	double Health;
	
	public Boots(int level, double itemHealth, String itemName) {
		super(level, itemName);
		this.Health = itemHealth;
	}
	
	public Boots(int level, double itemHealth, String itemName, String itemLore) {
		super(level, itemName, itemLore);
		this.Health = itemHealth;

	}

}
