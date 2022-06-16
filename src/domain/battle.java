package domain;

import domain.enemy;
import java.util.Random;

public class battle {
    private int bossChance;
    private int enemyTypeChance;
    private int enemyType;
    private int maxEnemies;
    private int enemyCount;
    Random random = new Random();

    public void generateEncounter() {
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

        int maxEnemies =

                = random.nextInt();
 */
    }

    public String generateAbility() {
        return "test";
    }

    public String combatConclusion(){
        return "test";
    }
}
