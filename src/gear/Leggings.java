package gear;

public class Leggings extends Armor{

	double Health;
	
	public Leggings(int level, double itemHealth, String itemName) {
		super(level, itemName);
		this.Health = itemHealth;
	}
	
	public Leggings(int level, double itemHealth, String itemName, String itemLore) {
		super(level, itemName, itemLore);
		this.Health = itemHealth;

	}

}
