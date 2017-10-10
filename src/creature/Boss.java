package creature;

/**
 * Boss constructor class
 * @author Ethan Mori
 *
 */
public class Boss extends Creature{

	/**
	 * Boss constructor
	 * @param type Type of creature (should always be boss)
	 * @param level Level of boss
	 */
	public Boss(CreatureType type, int level) {
		super(type, level);
		// TODO Auto-generated constructor stub
		
	}
	
	/**
	 * Boss constructor
	 * @param type Type of creature (should always be boss)
	 * @param level Level of boss
	 * @param name Name of boss 
	 */
	public Boss(CreatureType type, int level, String name) {
		super(type, level, name);
		// TODO Auto-generated constructor stub
	}

}
