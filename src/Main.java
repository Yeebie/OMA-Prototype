public class Main {
    public static void main(String[] args) {
        //Generate the enemies
        generateEncounter();
        //Gather encounter and enemy attributes and pick a decent ability
        generateAbility();
        //Use the ability and see what happens
        combatConclusion();
    }
}