//This file is to handle events related to the roles

public class Role {
    //setting attributes
    String title;
    String perk;
    boolean usedPerk;

    //constructor
    public Role(String Role,String Perk) {
        this.title = Role;
        this.perk = Perk;
        this.usedPerk = false;
    }

    //creating & setting roles
    Role Villager = new Role("Villager", "None");
    Role Doctor = new Role("Doctor", "Save");
    Role Psychic = new Role("Psychic", "Sight");
    Role Werewolf = new Role("Werewolf", "Hunt");

    //TODO: Set up perks
}