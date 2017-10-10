package gear;

public class Ring extends Armor{

	BonusType Type;
	int BonusAmount;
	
	public Ring(int level, BonusType type, int bonusAmount, String itemName) {
		super(level, itemName);
		this.Type = type;
		this.BonusAmount = bonusAmount;
	
	}
	
	public Ring(int level, BonusType type, int bonusAmount, String itemName, String itemLore) {
		super(level, itemName, itemLore);
		this.Type = type;
		this.BonusAmount = bonusAmount;
	
	}

}
