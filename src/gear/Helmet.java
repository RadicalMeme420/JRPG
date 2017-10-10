package gear;

public class Helmet extends Armor{

	double Health;
	
	public Helmet(int level, double itemHealth, String itemName) {
		super(level, itemName);
		this.Health = itemHealth;
	}
	
	public Helmet(int level, double itemHealth, String itemName, String itemLore) {
		super(level, itemName, itemLore);
		this.Health = itemHealth;

	}

}
