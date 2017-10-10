package creature;

/**
 * Object class for basic Creature object
 * @author Ethan Mori
 *
 */
public class Creature {
	
	int Level;
	double Health;
	CreatureType Type;
	String Name;
	
	/**
	 * Object Constructor with no given name
	 * @param type Creature type
	 * @param level Creature level
	 */
	public Creature(CreatureType type, int level) {
		this.Type = type;
		this.Level = level;
		this.Health = generateHealth(level);
	}
	
	/**
	 * Object Constructor with given name
	 * @param type Creature type
	 * @param level Creature level
	 * @param name Creature Name
	 */
	public Creature(CreatureType type, int level, String name) {
		this.Type = type;
		this.Level = level;
		this.Health = generateHealth(level);
		this.Name = name;
	}
	
	
	
	/**
	 * Generate creature health on initialization
	 * !!Only to be used on initial initialization!!
	 * @param level Level value to be modified
	 * @return health value to be set as creature health
	 */
	private int generateHealth(int level) {
		int health = level*5;
		return health;
	}
	
	/**
	 * Returns the level of this creature
	 * @return creature level
	 */
	public int getLevel() {
		return this.Level;
	}
	
	/**
	 * Returns the health of this creature
	 * @return creature health
	 */
	public double getHealth() {
		return this.Health;
	}
	
	/**
	 * Returns the type of this creature
	 * @return creature type
	 */
	public CreatureType getType() {
		return this.Type;
	}
	
	/**
	 * Returns the name of this creature
	 * @return creature name
	 */
	public String getName() {
		return this.Name;
	}
	
	/**
	 * Sets level of this creature
	 * @param level new level
	 */
	public void setLevel(int level) {
		this.Level = level;
	}
	
	/**
	 * Sets health of this creature
	 * @param health new health
	 */
	public void setHealth(double health) {
		this.Health = health;
	}
	
	/**
	 * Sets type of this creature
	 * @param type new type
	 */
	public void setType(CreatureType type) {
		this.Type = type;
	}
	
	/**
	 * Sets name of this creature
	 * @param name new name
	 */
	public void setName(String name) {
		this.Name = name;
	}
	
}
