/**
 * 
 */

/**
 * @author Maia
 *
 */
public class Character {

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

		public Character() { //Default Character
			healthPoints = 1;
			magicAttack = 1;
			magicResistance = 1;
			physicalAttack = 1;
			physicalResistance = 1;
			attackSpeed = 1;
			movementSpeed = 1;
			luck = 1;
			hitModifier = 1;
			dodgeModifier = 1;
			criticalChance = 1;
			//weaponProficiency[] = new int[WeaponController.getNumWeapons]; //TODO: write WeaponController.java
			/*
			 * for(int i = 0; i < weaponProficiency.length; i++) {
			 * 		weaponProficiency[i] = 1;
			 * }	//TODO: same as above
			 */
			//supportLevels[] = new int[SupportController.getNumWeapons]; //TODO: write SupportController.java
			/*
			 * for(int i = 0; i < supportLevels.length; i++) {
			 * 		supportLevels[i] = 1;
			 * }	//TODO: same as above
			 */
			//List<Effect> = new LinkedList<Effect> //TODO: implement EffectController.java
			//SpriteSet = new SpriteSet() //TODO: implement SpriteController.java
		}
}
