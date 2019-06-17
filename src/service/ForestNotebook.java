package service;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Plant;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForestNotebook {
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    //return the size of List of plants = the amount of plants
    public int getPlantCount() {
        return plants.size();
    }

    //return the size of List of animals = the amount of animals
    public int getAnimalCount() {
        return animals.size();
    }

    //add animals to the right list by checking with instanceof. Whenever an animal is added, the animal count goes up.
    public void addAnimal(Animal animal) {
        if (!isPresent(animal)) {
            animals.add(animal);
            animalCount = animals.size();
            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            } else if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            } else if (animal instanceof Omnivore) {
                omnivores.add((Omnivore) animal);
            }

        }

    }

    //check for duplicates with an isPresent method
    private boolean isPresent(Animal animal) {
        for (Animal given : animals) {
            if (given.getName().equalsIgnoreCase(animal.getName())) {
                return true;
            }
        }
        return false;
    }


    //add a plant to plant list and a plant to plantCount
    public void addPlant(Plant plant) {
        plants.add(plant);

    }

    //iterate through the lists and print them
    public void printNoteBook() {
        System.out.println("----------Animals-----------");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("----------Plants------------");
        for (Plant plant : plants) {
            System.out.println(plant);
        }

    }

    //use streams to sort the lists
    public void sortAnimalsByName() {
        this.animals.sort(Comparator.comparing(Animal::getName));

    }

    public void sortPlantsByName() {
        this.plants.sort(Comparator.comparing(Plant::getName));

    }

    public void sortAnimalsByHeight() {
        this.animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        this.plants.sort(Comparator.comparing(Plant::getHeight));

    }


}
