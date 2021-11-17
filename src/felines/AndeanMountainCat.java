package felines;

public class AndeanMountainCat extends Felis{

    public AndeanMountainCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    public void miauw(String customSound){}


    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return "AndeanMountainCat{ Coutaion!!! De AndeanMountainCat is uitgestorven. |name: "+ getName()+" |age: "
                +getAge()+" |shelter no: "+getShelterNo()+"|badge no: "+getBadgeNo()+" }";

    }

}

