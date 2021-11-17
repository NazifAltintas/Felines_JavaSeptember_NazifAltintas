package felines;

public class NorwegianForestCat extends Felis{

    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }
    public void miauwInNorvegian(){}

    @Override
    public String toString() {
        return "NorwegianForestCat{ |name: "+ getName()+" |age: "
                +getAge()+" |shelter no: "+getShelterNo()+"|badge no: "+getBadgeNo()+" }";

    }


    }


