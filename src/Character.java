/**
 * 
 */

import java.io.File;
/*import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;*/
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.lang.IndexOutOfBoundsException;
import java.lang.ClassNotFoundException;
import java.io.Serializable;


/**
 * @author Maia
 *
 */
public class Character implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int 
		healthPoints, 
		magicAttack,
		magicResistance,
		physicalAttack,
		physicalResistance,
		attackSpeed,
		movementSpeed,
		luck,
		hitModifier,
		dodgeModifier,
		criticalChance;
	private int[]	
		weaponProficiency,
		supportLevel;
	/*
	 *  private 	List<Effect>
	 *		battleEffect; //TODO: Make this a List of Effects when Effects has been written
	 **/ 
	/*
	 *  private SpriteSet 
	 * 		sprites; //TODO: Make this a SpriteSet object when SpriteSet has been written
	 * */ 

	public Character(File charFile) {
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(charFile));
			Character c = (Character) stream.readObject();
			stream.close();
			this.healthPoints = c.healthPoints;
			this.magicAttack = c.magicAttack;
			this.magicResistance = c.magicResistance;
			this.physicalAttack = c.physicalAttack;
			this.physicalResistance = c.physicalResistance;
			this.attackSpeed = c.attackSpeed;
			this.movementSpeed = c.movementSpeed;
			this.luck = c.luck;
			this.hitModifier = c.hitModifier;
			this.dodgeModifier = c.dodgeModifier;
			this.criticalChance = c.criticalChance;
			this.weaponProficiency = new int[c.weaponProficiency.length];
			for(int i = 0; i < this.weaponProficiency.length; i++) {
				this.weaponProficiency[i] = c.weaponProficiency[i];
			}
			this.supportLevel = new int[c.supportLevel.length];
			for(int i = 0; i < this.supportLevel.length; i++) {
				this.supportLevel[i] = c.supportLevel[i];
			}
			/*this.battleEffect = new LinkedList(c.battleEffect);
			this.sprites = new SpriteSet(c.sprites); */ 	//TODO: Uncomment these lines after creating SpriteSet and Effect
		}
		catch(IOException io) {
			System.out.println("IOException: file " + charFile + " could not be found in the file system.");
			io.printStackTrace();
		}
		catch(ClassNotFoundException cnf) {
			System.out.println("ClassNotFoundException: a class in" + charFile + " could not be found in the class path.");
			cnf.printStackTrace();
		}
		catch(IndexOutOfBoundsException ioob) {
			System.out.println("IndexOutOfBoundsException: there was a problem converting " + charFile + " to a Character.");
			ioob.printStackTrace();
		}
	}
}
