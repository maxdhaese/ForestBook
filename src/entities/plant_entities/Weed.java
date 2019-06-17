package entities.plant_entities;

public class Weed extends Plant {
    private double area;

    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed: " + getName() + "\n\t\t Height: " + getHeight() + "m Area: " + getArea();
    }
}
