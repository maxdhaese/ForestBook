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

        ForestNotebook forestNotebook = new ForestNotebook();

        Weed nettle = new Weed("Nettle", 0.5);
        Tree oak = new Tree("Oak", 20);
        oak.setLeaftype(Leaftype.HAND);
        Flower rose = new Flower("Rose", 0.4);
        rose.setSmell(Scent.SWEET);
        Bush burr = new Bush("Burr", 2);
        burr.setFruit("blackberry");
        burr.setLeaftype(Leaftype.NEEDLE);
        Tree hazel = new Tree("Hazel", 20);
        hazel.setLeaftype(Leaftype.ROUND);


//        forestNotebook.addPlant(nettle);
//        forestNotebook.addPlant(oak);
//        forestNotebook.addPlant(rose);
//        forestNotebook.addPlant(burr);
//        forestNotebook.addPlant(hazel);

        Set<Plant> plantDietList = new HashSet<>();
        plantDietList.add(burr);
        plantDietList.add(nettle);
        plantDietList.add(hazel);


        Omnivore blackbear = new Omnivore("BlackBear", 200, 2.5, 2);
        blackbear.setMaxFoodSize(3);
        blackbear.setPlantDiet(plantDietList);

        Omnivore brownbear = new Omnivore("BrownBear", 120, 180, 1.90);
        brownbear.setMaxFoodSize(2);
        brownbear.setPlantDiet(plantDietList);

        Omnivore coyote = new Omnivore("Coyote", 60, 80, 1.40);
        coyote.setMaxFoodSize(1);
        coyote.setPlantDiet(plantDietList);

        Carnivore wolf = new Carnivore("Wolf", 70, 1, 1.8);
        wolf.setMaxFoodSize(1);

        Carnivore shark = new Carnivore("Shark", 260, 0.6, 3);
        shark.setMaxFoodSize(2);

        Carnivore tiger = new Carnivore("Tiger", 140, 1.2, 2.5);
        tiger.setMaxFoodSize(2);

        Herbivore elephant = new Herbivore("Elephant", 500, 3, 3.5);
        elephant.setPlantDiet(plantDietList);

        Herbivore giraffe = new Herbivore("Giraffe", 350, 5, 4);
        giraffe.setPlantDiet(plantDietList);

        Herbivore deer = new Herbivore("Deer", 90, 1.50, 2);
        deer.setPlantDiet(plantDietList);

        forestNotebook.addAnimal(blackbear);
        forestNotebook.addAnimal(brownbear);
        forestNotebook.addAnimal(coyote);
        forestNotebook.addAnimal(wolf);
        forestNotebook.addAnimal(shark);
        forestNotebook.addAnimal(tiger);
        forestNotebook.addAnimal(elephant);
        forestNotebook.addAnimal(giraffe);
        forestNotebook.addAnimal(deer);

        forestNotebook.printNoteBook();




    }
}
