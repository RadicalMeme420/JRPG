package creature;

import gear.Weapon;
import gear.Ring;

public class Monster extends Creature{

	Weapon Weapon;
	Ring Ring;
	
	public Monster(CreatureType type, int level, double Health) {
		super(type, level);
		// TODO Auto-generated constructor stub
	}
	
	public Monster(CreatureType type, int level, String name, double Health) {
		super(type, level, name);
		// TODO Auto-generated constructor stub
	}

	
}
