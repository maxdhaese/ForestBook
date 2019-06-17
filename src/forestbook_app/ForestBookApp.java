package forestbook_app;

import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.*;
import service.ForestNotebook;

import java.util.HashSet;
import java.util.Set;

public class ForestBookApp {
    public static void main(String[] args) {
        
        //create an object of ForestbookClass
        ForestNotebook forestNotebook = new ForestNotebook();

        //create different Plant objects
        Weed nettle = new Weed("Nettle", 0.5);
        nettle.setArea(1);
        Tree oak = new Tree("Oak", 20);
        oak.setLeaftype(Leaftype.HAND);
        Flower rose = new Flower("Rose", 0.4);
        rose.setSmell(Scent.SWEET);
        Bush burr = new Bush("Burr", 2);
        burr.setFruit("blackberry");
        burr.setLeaftype(Leaftype.NEEDLE);
        Tree hazel = new Tree("Hazel", 20);
        hazel.setLeaftype(Leaftype.ROUND);

        //add the plants to the forestNotebook
        forestNotebook.addPlant(nettle);
        forestNotebook.addPlant(oak);
        forestNotebook.addPlant(rose);
        forestNotebook.addPlant(burr);
        forestNotebook.addPlant(hazel);

        //create objects of Animal
        Omnivore blackbear = new Omnivore("BlackBear", 200, 2.5, 2);
        blackbear.setMaxFoodSize(3);
        blackbear.addPlantToDiet(hazel);

        Omnivore brownbear = new Omnivore("BrownBear", 120, 1.80, 1.90);
        brownbear.setMaxFoodSize(2);
        brownbear.addPlantToDiet(burr);

        Omnivore coyote = new Omnivore("Coyote", 60, 0.80, 1.40);
        coyote.setMaxFoodSize(1);
        coyote.addPlantToDiet(nettle);

        Carnivore wolf = new Carnivore("Wolf", 70, 1, 1.8);
        wolf.setMaxFoodSize(1);

        Carnivore shark = new Carnivore("Shark", 260, 0.6, 3);
        shark.setMaxFoodSize(2);

        Carnivore tiger = new Carnivore("Tiger", 140, 1.2, 2.5);
        tiger.setMaxFoodSize(2);

        Herbivore elephant = new Herbivore("Elephant", 500, 3, 3.5);
        elephant.addPlantToDiet(hazel);

        Herbivore giraffe = new Herbivore("Giraffe", 350, 5, 4);
        giraffe.addPlantToDiet(hazel);

        Herbivore deer = new Herbivore("Deer", 90, 1.50, 2);
        deer.addPlantToDiet(burr);

        //add the animals to the forestNotebook
        forestNotebook.addAnimal(blackbear);
        forestNotebook.addAnimal(brownbear);
        forestNotebook.addAnimal(coyote);
        forestNotebook.addAnimal(wolf);
        forestNotebook.addAnimal(shark);
        forestNotebook.addAnimal(tiger);
        forestNotebook.addAnimal(elephant);
        forestNotebook.addAnimal(giraffe);
        forestNotebook.addAnimal(deer);

        //print out the amount of plants and animals we saw
        System.out.println("Number of Animals counted: " + forestNotebook.getAnimalCount() + "\nNumber of Plants counted: " + forestNotebook.getPlantCount());

        //print the complete list of animals and plants
        forestNotebook.printNoteBook();

        System.out.println(" ");

        //print the Lists of animal classes separately
        System.out.println("-------Carnivores---------");
        forestNotebook.getCarnivores().forEach(System.out::println);
        System.out.println("-------Herbivores---------");
        forestNotebook.getHerbivores().forEach(System.out::println);
        System.out.println("-------Omnivores----------");
        forestNotebook.getOmnivores().forEach(System.out::println);

        System.out.println(" ");

        //sorted list by name
        System.out.println("Sorted by name: ");
        forestNotebook.sortAnimalsByName();
        forestNotebook.sortPlantsByName();
        forestNotebook.printNoteBook();

        System.out.println(" ");

        //sorted list by height
        System.out.println("Sorted by height: ");
        forestNotebook.sortAnimalsByHeight();
        forestNotebook.sortPlantsByHeight();
        forestNotebook.printNoteBook();







    }
}
