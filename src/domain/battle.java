package domain;

import domain.enemy;
import java.util.Random;

public class battle {
    private int bossChance;
    private int enemyTypeChance;
    private int enemyType;
    private int enemyCount;
    private int maxEnemies;
    Random random = new Random();

    public void generateEncounter() {
        /**
         * Rolling Boss Chance
         */
        bossChance = 20;
        enemy Enemy = new enemy();
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
        if (enemyType == 0){
            enemyCount = 1;
        } else {
            enemyCount = random.nextInt(maxEnemies) + 1;
            Enemy.setEnemyCount(enemyCount);
        }
        System.out.println("Amount of enemies in group: " +  enemyCount);

    }

    public String generateAbility() {
        return "test";
    }

    public String combatConclusion(){
        return "test";
    }
}
