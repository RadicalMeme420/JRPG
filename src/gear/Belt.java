package gear;

public class Belt extends Armor{

	BonusType Type;
	int BonusAmount;
	
	public Belt(int level, BonusType type, int bonusAmount, String itemName) {
		super(level, itemName);
		this.Type = type;
		this.BonusAmount = bonusAmount;
	
	}
	
	public Belt(int level, BonusType type, int bonusAmount, String itemName, String itemLore) {
		super(level, itemName, itemLore);
		this.Type = type;
		this.BonusAmount = bonusAmount;
	
	}

}
