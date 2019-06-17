package entities.plant_entities;

public class Bush extends Plant {
    private String fruit;
    private Leaftype leaftype;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public Leaftype getLeaftype() {
        return leaftype;
    }

    public void setLeaftype(Leaftype leaftype) {
        this.leaftype = leaftype;
    }

    @Override
    public String toString() {
        return "Bush: " + getName() + "\n\t\t Height: " + getHeight() + " LeafType: " + getLeaftype() + " Fruit: " + getFruit();
    }
}
