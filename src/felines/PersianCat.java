package felines;

public class PersianCat extends Felis{

    public PersianCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    @Override
    public void miauw() {

    }
    @Override
    public String toString() {
        return "PersianCat{ |name: "+ getName()+" |age: "
                +getAge()+" |shelter no: "+getShelterNo()+"|badge no: "+getBadgeNo()+" }";

    }
}
