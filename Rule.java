//This file is to handle events related to the rules

public class Rule {
    //setting attributes
    String label;
    String msg;

    //constructor
    public Rule(String Label,String Message) {
        this.label = Label;
        this.msg = Message;
    }

    //constructor (no input)
    public Rule() {
        this.label = "empty";
        this.msg = "empty";
    }

    //creating & setting rules
    static Rule Basic = new Rule("Game Overview","Welcome to Werewolf!"+"\nYou, the user, will be playing against 5 other players controlled by the program."+"\nIn this game, you will either try to survive the night and chase out the imposter or eliminate the other players as the werewolf."
    +"\nEach night the players will go to sleep and players with special roles will each get their turn to use their perk. Then everyone will wake up and find out about what happened in the night."+"\nThe detective will inspect each player's house and then the players will vote on who they think is the werewolf and the player with the most votes is eliminated.\nBut keep an eye out for clues that are just part of a hobby...");
    static Rule Vil = new Rule("Villager", "You are a villager.\nSleep through the night and vote out the werewolf in the morning.");
    static Rule Doc = new Rule("Doctor", "You are the doctor.\nChoose someone to save in the night and vote out the werewolf in the morning.");
    static Rule Psy = new Rule("Psychic", "You are the psychic.\nChoose someone to have their role revealed to you in the night.");
    static Rule Wer = new Rule("Werewolf", "You are the werewolf!\nChoose someone to eliminate in the night and try to not look too suspicious in the morning.");

    //printing rules
    public void print(Rule rule) {
        System.out.println(rule.label);
        //if rule is Basic
        if (rule == Basic) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println(rule.msg);
            System.out.println("----------------------------------------------------------------------------");
        //rule is not basic
        } else {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println(rule.msg);
            System.out.println("-------------------------------------------------------------------------");
        }
    }
}