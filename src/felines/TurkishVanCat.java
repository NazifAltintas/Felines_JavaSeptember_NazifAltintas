package felines;


public class TurkishVanCat extends Felis{

    public String nickname;

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

    @Override
    public String toString() {
        return "TurkishVanCat{ |name: "+ getName()+" |age: "
                +getAge()+" |shelter no: "+getShelterNo()+"|badge no: "+getBadgeNo()+" }";

    }

}
