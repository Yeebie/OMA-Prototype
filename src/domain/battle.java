package domain;

import domain.enemy;

import java.sql.Array;
import java.util.Random;
import java.util.ArrayList;

public class battle {
    private int bossChance;
    private int enemyTypeChance;
    private int enemyType;
    private int enemyCount;
    private int maxEnemies;
    Random random = new Random();
    enemy Enemy = new enemy();
    ability Ability = new ability();
    ArrayList<String> abilityType = new ArrayList<String>();
    ArrayList combatAbilities = new ArrayList<ability>();
    String combatType;

    public void generateEncounter() {
        /**
         * Rolling Boss Chance
         */
        bossChance = 20;
        String[] type = {"Boss", "Mob"};
        Enemy.setTypeArray(type);
        enemyTypeChance = random.nextInt(100);
        if(enemyTypeChance <= bossChance) {
            enemyType = 0;
        } else {
            enemyType = 1;
        }
        Enemy.setType(enemyType);
        //Debug print statements
        System.out.println("");
        System.out.println("Mob Type: " + Enemy.getType());
        System.out.println("Current Percentage Roll: " + enemyTypeChance + "%");
        System.out.println("Boss Spawn Chance: " + bossChance + "%");

        /**
         * Mob count
         * Just 1 boss for now
         */
        maxEnemies = 3;
        if(enemyType == 0){
            enemyCount = 1;
        } else {
            enemyCount = random.nextInt(maxEnemies) + 1;
            Enemy.setEnemyCount(enemyCount);
        }
        System.out.println("Amount of enemies in group: " +  enemyCount);
        System.out.println("");
    }

    /**
     * Change type to tags? Make abilities cross over into different use cases
     * Have a tag array?
     * Load all abilities up into an array
     * This section can be done in a loop but right now I'm just jotting stuff down to get a general feel on what I want
     * Maybe take some inspiration from Synthetik? What sort of underhanded methods would Kazuma use? What tech would an
     * overpowered enemy use and how can we abuse it?
     */
    public String generateAbility() {

        ArrayList<ability> abilityMasterList = new ArrayList<>();
        /**
         * The single target queen. Will drain shields and stun.
         */
        Ability = new ability();
        Ability.setName("Sawed-Off");
        Ability.setDescription("A Sawed-Off Double Barrel Shotgun loaded with high power Taser Shells.");
        abilityType = new ArrayList<>();
        abilityType.add("Offensive");
        abilityType.add("Stun");
        abilityType.add("Single");
        Ability.setType(abilityType);
        abilityMasterList.add(Ability);
        System.out.println(Ability.getName());
        System.out.println(Ability.getDescription());
        System.out.println(Ability.getType());
        System.out.println("");

        /**
         * Kinda what I wanted the shotgun to do if I didn't want it to be good
         * Large screen wide swipe, relatively close range, causes knockback
         * Name it Chunchunmaru? Well, then it isn't a folding sword, it's something else entirely
         */
        Ability = new ability();
        Ability.setName("Folding Sword");
        Ability.setDescription("A compact sword that causes close range knockback.");
        abilityType = new ArrayList<>();
        abilityType.add("Defensive");
        abilityType.add("Knockback");
        abilityType.add("Multi");
        Ability.setType(abilityType);
        abilityMasterList.add(Ability);
        System.out.println(Ability.getName());
        System.out.println(Ability.getDescription());
        System.out.println(Ability.getType());
        System.out.println("");

        /**
         * Long effect stun
         */
        Ability = new ability();
        Ability.setName("Flash");
        Ability.setDescription("The perfect tactical grenade for temporarily blinding yourself.");
        abilityType = new ArrayList<>();
        abilityType.add("Defensive");
        abilityType.add("Stun");
        abilityType.add("Multi");
        abilityType.add("Single");
        Ability.setType(abilityType);
        abilityMasterList.add(Ability);
        System.out.println(Ability.getName());
        System.out.println(Ability.getDescription());
        System.out.println(Ability.getType());
        System.out.println("");

        /**
         * Will spell tome be divided under a specific set of abilities?
         * Like Offensive - Spells?
         * Honestly sounds more like an item you pick up to add spells to the ability list
         */
        //Ability.setName("Spell Tome");
        //Ability.setDescription("A book that allows easy use spells.");
        //Ability.setType("Offensive");

        /**
         * Jury rigged as in Rust jury rigged, cobbled together but still works flawlessly
         */
        Ability = new ability();
        Ability.setName("Jury Rigged Turret");
        Ability.setDescription("A turret made out of sand, duct tape, and a CV-47.");
        abilityType = new ArrayList<>();
        abilityType.add("Defensive");
        abilityType.add("Multi");
        abilityType.add("Single");
        Ability.setType(abilityType);
        abilityMasterList.add(Ability);
        System.out.println(Ability.getName());
        System.out.println(Ability.getDescription());
        System.out.println(Ability.getType());
        System.out.println("");

        /**
         * A health source not found from enemy drops
         * I'm thinking Terraria style flasks rather than stims
         */
        Ability = new ability();
        Ability.setName("Backup Health Potion");
        Ability.setDescription("A backup health potion packed by yours truly");
        abilityType = new ArrayList<>();
        abilityType.add("Idle");
        Ability.setType(abilityType);
        abilityMasterList.add(Ability);
        System.out.println(Ability.getName());
        System.out.println(Ability.getDescription());
        System.out.println(Ability.getType());
        System.out.println("");

        /**
         * An ammo source not found from enemy drops
         * Is a big ol' box humorous enough? Is a couple of mags strapped together a bit more balanced?
         */
        Ability = new ability();
        Ability.setName("Ammo Pouch");
        Ability.setDescription("A couple mags never hurt anyone.");
        abilityType = new ArrayList<>();
        abilityType.add("Idle");
        Ability.setType(abilityType);
        abilityMasterList.add(Ability);
        System.out.println(Ability.getName());
        System.out.println(Ability.getDescription());
        System.out.println(Ability.getType());
        System.out.println("");

        /*for(ability type:abilityMasterList) {
            System.out.println(type.getName());
            System.out.println(type.getType());
        }*/

        System.out.println("Filtering potentially usable abilities into a list");

        if(enemyType == 0) {
            combatType = "Single";
        } else {
            combatType = "Multi";
        }
            //For every ability in the ability list
            for(ability Ability:abilityMasterList) {
                //Retrieve all types for the ability
                ArrayList types = new ArrayList<String>(Ability.getType());
                //For every type categorised for the ability
                //System.out.println(types);
                for (Object value : types) {
                    //System.out.println(value);
                    if (value.toString() == combatType) {
                        System.out.println(Ability.getName());
                        combatAbilities.add(Ability);
                    }
                }
            }
        System.out.println("");

                for(Object combatAbility:combatAbilities) {
                    System.out.println(combatAbility.toString());
                    System.out.println(combatAbility);
                }




                /**for(value:types) {
                    System.out.println(value);
                }*/
                /**
                if(type.getType() = "Single") {
                    System.out.println(type);
                }*/

        //} else {

        //}

        return "test";
    }

    public String combatConclusion(){
        return "test";
    }
}
