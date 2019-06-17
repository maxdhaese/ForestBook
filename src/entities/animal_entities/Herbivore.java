package entities.animal_entities;

import entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal {
    private Set<Plant> plantDiet = new HashSet<>();


    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);

    }

    public void printDiet() {
        plantDiet.forEach(System.out::println);

    }

    @Override
    public String toString() {
        return "Herbivore: " + getName() + " Properties: -height: " + getHeight() + " weight: " + getWeight() + " length: " + getLength() + "\n\t\t PlantDiet: " + getPlantDiet();
    }
}
