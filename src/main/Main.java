package main;

import creature.CreatureType;
import creature.Monster;
import creature.Player;
import gear.Sword;
import item.Item;
import npc.NPC;
import config.Config;

public class Main {

	public static Player Player;
	public static final Config cfg = config.Config.getConfig();
	
	public static void main(String[] args) {
		/**
		 * 
        creature.Player.createPlayer();
        Sword masterSword = new Sword(69, 69, "MasterSword", "wew \nlad");
        Player.getInventory().setItem(2, masterSword);
        
        Monster m = new Monster(CreatureType.MONSTER, 1, "Hella yeet", 20d);
        
		 */
	    System.out.println(cfg.getDebug());
	}
	
	

}
