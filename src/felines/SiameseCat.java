package felines;

public class SiameseCat extends Felis{

    public SiameseCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "SiameseCat{ |name: "+ getName()+" |age: "
                +getAge()+" |shelter no: "+getShelterNo()+"|badge no: "+getBadgeNo()+" }";

    }
}
