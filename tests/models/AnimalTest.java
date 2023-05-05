package models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AnimalTest {

    @Test
    void implicare(){
        Catel catel = new Catel("catel", "akita", 14, "Rex", "maro", 25.5);
        Catel catel1 = new Catel("catel", "bichon", 4, "Miki", "alb", 4.2);

        Pisica pisica = new Pisica("pisica" ,"british", 6,"Daisy", "portocaliu", 5.1);
        Pisica pisica1 = new Pisica("pisica", "caracal", 7,"Dante", "maro", 10.8);

        Animal animal = catel1;

        animal=pisica1;

//        System.out.println(animal.descreire());

        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(catel);
        animals.add(catel1);
        animals.add(pisica);
        animals.add(pisica1);

//        for (int i=0; i<animals.size(); i++){
//            if (animals.get(i) instanceof Catel){
//                Catel c =(Catel) animals.get(i);
//                System.out.println(c.descriereCatel());
//            }
//        }

//        for (int i=0; i<animals.size(); i++){
//            if (animals.get(i) instanceof Pisica){
//                Pisica p=(Pisica) animals.get(i);
//                System.out.println(p.descriere());
//            }
//        }

        Animal animal1 = pisica1;
        System.out.println(animal1.descreire());

    }
}