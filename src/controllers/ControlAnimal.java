package controllers;

import models.Animal;
import models.Catel;
import models.Pisica;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlAnimal {

    private ArrayList<Animal> animals;

    public ControlAnimal() {
        this.animals = new ArrayList<>();
        load();
        play();
    }

    private void load() {
        try {
            File file = new File("C:\\mycode\\OOP\\mostenirea-polimorfism\\exercitiu\\src\\data\\animal.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                switch (text.split(",")[0]) {
                    case "catel":
                        animals.add(new Catel(text));
                        break;
                    case "pisica":
                        animals.add(new Pisica(text));
                        break;
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void play() {
        Scanner scanner = new Scanner(System.in);
        String alegere = scanner.nextLine();
        switch (alegere) {
            case "catel":
                readCatel();
                break;
            case "pisica":
                readPisica();
                break;
            default:
                break;
        }
    }

    private void readCatel() {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Catel) {
                Catel catel = (Catel) animals.get(i);
                System.out.println(catel.descriere());
            }
        }
    }

    private void readPisica(){
        for (int i=0; i<animals.size(); i++){
            if (animals.get(i) instanceof Pisica){
                Pisica pisica = (Pisica) animals.get(i);
                System.out.println(pisica.descriere());
            }
        }
    }

//    private String toSave() {
//        if (animals.size() == 0) {
//            return "";
//        }
//        int i = 0;
//        String text = "";
//        for (i = 0; i < animals.size() - 1; i++) {
//            text += animals.get(i).toSave() + "\n";
//        }
//        text += animals.get(i).toSave();
//        return text;
//    }
//
//    public void save() {
//        try {
//            File file = new File("C:\\mycode\\OOP\\mostenirea-polimorfism\\exercitiu\\src\\data\\animal.txt");
//            FileWriter fileWriter = new FileWriter(file);
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//            printWriter.print(toSave());
//            printWriter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public void add(Animal animal) {
        animals.add(animal);
    }
}
