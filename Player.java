//This file is to handle events related to the players

import java.util.ArrayList;
import java.util.Collections;

public class Player {
    //setting attributes
    String name;
    Role role;
    Note notes; //TODO: set up notes feature
    Rule rule;
    String charT1; //character traits
    String charT2;
    String charT3;
    ArrayList<Hint> hints;
    
}

class Hint {
    //creating attributes
    String hint;
    int priority;
    //creating hint arraylists
    static ArrayList<Hint> petH = new ArrayList<>();
    static ArrayList<Hint> designerH = new ArrayList<>();
    static ArrayList<Hint> stylistH = new ArrayList<>();
    static ArrayList<Hint> moonH = new ArrayList<>();
    static ArrayList<Hint> villH = new ArrayList<>();
    static ArrayList<Hint> docH = new ArrayList<>();
    static ArrayList<Hint> psycH = new ArrayList<>();
    static ArrayList<Hint> wereH = new ArrayList<>();
    //creating location arraylist
    static ArrayList<String> locations = new ArrayList<>();

    //constructor
    public Hint(String Hint,int Priority) {
        this.hint = Hint;
        this.priority = Priority;
    }

    //setting hints
    public void setHints() {
        //pet owner hints
        petH.add(new Hint("fur", 5));
        petH.add(new Hint("a bone", 4));
        petH.add(new Hint("pawprints", 5));
        petH.add(new Hint("a dog brush", 4));
        petH.add(new Hint("flea repellant", 5));
        petH.add(new Hint("an id tag", 2));
        petH.add(new Hint("a nail trimmer", 3));
        petH.add(new Hint("a pet bed",1));

        //clothing designer hints
        designerH.add(new Hint("cloth scraps", 5));
        designerH.add(new Hint("a sewing needle", 1));
        designerH.add(new Hint("a measuring tape", 1));
        designerH.add(new Hint("torn clothes", 5));
        designerH.add(new Hint("a big shirt", 2));
        designerH.add(new Hint("big pants", 3));

        //hair stylist hints
        stylistH.add(new Hint("hair", 4));
        stylistH.add(new Hint("a big brush", 5));
        stylistH.add(new Hint("hair dye", 1));
        stylistH.add(new Hint("a small pile of hair", 5));
        stylistH.add(new Hint("hair clippers", 1));
        stylistH.add(new Hint("specialized hair care", 3));
        
        //moon enthusiest hints
        moonH.add(new Hint("a moon photo", 4));
        moonH.add(new Hint("a moon phase poster", 3));
        moonH.add(new Hint("a moon plushy", 5));
        moonH.add(new Hint("moon books", 2));
        moonH.add(new Hint("moon club poster", 1));

        //villager hints
        villH.add(new Hint("a shirt", 5));
        villH.add(new Hint("a brush", 5));
        villH.add(new Hint("a hair tie", 5));
        villH.add(new Hint("clothes", 5));
        villH.add(new Hint("headphones", 5));
        psycH.add(new Hint("a measuring tape", 5));
        psycH.add(new Hint("books", 5));
        psycH.add(new Hint("a necklace", 5));
        psycH.add(new Hint("a hatbracelet", 5));
        psycH.add(new Hint("a hat", 5));

        //doctor hints
        docH.add(new Hint("a white shirt", 5));
        docH.add(new Hint("a notebook", 5));
        docH.add(new Hint("a comb", 5));
        docH.add(new Hint("clothes", 5));
        docH.add(new Hint("files", 5));
        psycH.add(new Hint("an id tag", 5));
        psycH.add(new Hint("books", 5));
        psycH.add(new Hint("a watch", 5));
        psycH.add(new Hint("a hat", 5));
        psycH.add(new Hint("a bracelet", 5));

        //psychic hints
        psycH.add(new Hint("a crystal", 5));
        psycH.add(new Hint("clothes", 5));
        psycH.add(new Hint("specialized hair care", 5));
        psycH.add(new Hint("moon books", 5));
        psycH.add(new Hint("sweaters", 5));
        psycH.add(new Hint("flowers", 5));
        psycH.add(new Hint("blankets", 5));
        psycH.add(new Hint("a weighted plushy", 5));
        psycH.add(new Hint("a bracelet", 5));
        psycH.add(new Hint("a necklace", 5));

        //werewolf hints
        psycH.add(new Hint("clothes", 5));
        psycH.add(new Hint("fur", 5));
        psycH.add(new Hint("cloth scraps", 5));
        psycH.add(new Hint("a small pile of hair", 5));
        psycH.add(new Hint("a moon plushy", 5));
        psycH.add(new Hint("flea repellant", 5));
        psycH.add(new Hint("a moon phase poster", 5));
        psycH.add(new Hint("blankets", 5));
        psycH.add(new Hint("ear buds", 5));
        psycH.add(new Hint("a bracelet", 5));
    }

    //setting locations
    public void setLocations() {
        locations.add("bed");
        locations.add("bathroom floor");
        locations.add("dining table");
        locations.add("desk");
        locations.add("bedside table");
        locations.add("kitchen counter");
        locations.add("bedroom floor");
        locations.add("couch");
        locations.add("carpet");
        locations.add("garage floor");
        locations.add("stairs");
        locations.add("bookshelf");
        locations.add("kitchen chair");
    }
    //adding player role & trait hints
    public void AddHints(Player player,String trait) {
        //creating switch case based on player trait
        switch (trait) {
            case "Pet Owner":
                player.hints.addAll(petH);
                break;
            case "Clothes Designer":
                player.hints.addAll(designerH);
                break;
            case "Hair Stylist":
                player.hints.addAll(stylistH);
                break;
            case "Moon Enthusiest":
                player.hints.addAll(moonH);
                break;
        }

        //creating switch case
        switch (player.role.title) {
            case "Villager":
                player.hints.addAll(villH);
                break;
            case "Doctor":
                player.hints.addAll(docH);
                break;
            case "Psychic":
                player.hints.addAll(psycH);
                break;
            case "Werewolf":
                player.hints.addAll(wereH);
                break;   
        }
    }

    //removing all player hints based on player role
    public void clearHints (Player player) {
        player.hints.clear();
    }

    //printing hint
    public void print(Player player) {
        //setting attributes
        boolean match = false;
        //creating arraylist
        ArrayList<Integer> num = new ArrayList<>();
        //adding elements to num
        num.add(1);
        num.add(2);
        num.add(2);
        num.add(3);
        num.add(3);
        num.add(3);
        num.add(4);
        num.add(4);
        num.add(4);
        num.add(4);
        num.add(5);
        num.add(5);
        num.add(5);
        num.add(5);
        num.add(5);

        while (!match) {
            //shuffling hints
            Collections.shuffle(player.hints);
            //shuffling num
            Collections.shuffle(num);

            //if num element = hint priority
            if (num.get(0) == player.hints.get(0).priority) {
                //updating var
                match = true;
                Collections.shuffle(locations);
                System.out.println("The detective found "+player.hints.get(0)+" on the "+locations.get(0)+" in "+player.name+"'s house.");
                //TODO: give this info to computer players
            }
        }
    }
}

class Search {}
