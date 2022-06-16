import domain.ability;
import domain.battle;
import domain.enemy;

public class Main {
    static battle Battle = new battle();
    public static void main(String[] args) {

        //Generate the enemies
        Battle.generateEncounter();
        //Gather encounter and enemy attributes and pick a decent ability
        /**generateAbility();
        //Use the ability and see what happens
        combatConclusion();
         */
    }
}