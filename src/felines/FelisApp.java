package felines;

import java.util.ArrayList;
import java.util.List;

public class FelisApp {

    public static void main(String[] args) {


        PersianCat pc = new PersianCat("Ariana", 1, 45, 45);
        SiameseCat sc = new SiameseCat("Maya", 4, 444, 45);
        TurkishVanCat tc = new TurkishVanCat("Lola", 3, 100, 7);
        AndeanMountainCat ac = new AndeanMountainCat("Daisy", 1, 100, 45);
        AndeanMountainCat ac1 = new AndeanMountainCat("Daisy", 1, 45, 45);
        NorwegianForestCat nc = new NorwegianForestCat("Mr.Kitty", 1, 45, 45);
        TurkishVanCat tc1 = new TurkishVanCat("Gizmo", 3, 1009, 7);


        Felis[] fc = {pc, sc, tc, ac, ac1, nc, tc1};

        for (Felis myFelis : fc) {
            if (myFelis.isAlive()) {
                System.out.println("" + myFelis);
            } else {
                System.out.println("This cat is not alive: " + myFelis);
            }
        }

        System.out.println("\nNumber of cats to be vaccinated: " + Felis.getNoOfVaccinatedCats());
        System.out.println();

        for (int i = 0; i < fc.length - 1; i++) {
            for (int k = i + 1; k < fc.length; k++) {
                if (fc[i].equals(fc[k])) {
                    System.err.println(fc[i].getName() + " and " + fc[k].getName() + " is same cat");
                } else {
                    System.out.println(fc[i].getName() + " and " + fc[k].getName() + " is not same cat");

                }


            }
        }
    }
}







