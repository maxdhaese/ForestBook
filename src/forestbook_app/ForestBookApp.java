package forestbook_app;

import entities.plant_entities.*;
import service.ForestNotebook;

public class ForestBookApp {
    public static void main(String[] args) {

        ForestNotebook forestNotebook = new ForestNotebook();

        Weed nettle = new Weed("Nettle",0.5);
        Tree oak = new Tree("Oak",20);
        oak.setLeaftype(Leaftype.HAND);
        Flower rose = new Flower("Rose",0.4);
        rose.setSmell(Scent.SWEET);
        Bush burr = new Bush("Burr",2);
        burr.setFruit("blackberry");
        burr.setLeaftype(Leaftype.NEEDLE);
        Tree hazel = new Tree("Hazel",20);
        hazel.setLeaftype(Leaftype.ROUND);



    }
}
