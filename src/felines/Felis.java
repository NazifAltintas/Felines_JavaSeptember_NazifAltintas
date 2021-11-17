package felines;

import java.util.Objects;

public class Felis extends Animal {

    private static int vaccitationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    {
        if (isAlive()) {
            vaccitationCount++;
        }
    }


    public Felis(String name, int age, int shelterNo, int badgeNo) {
        setName(name);
        setAge(age);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);

    }


    public void miauw() {
    }

    public void miauw(int times) {
    }

    public static int getNoOfVaccinatedCats() {
        return vaccitationCount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShelterNo() {
        if (shelterNo == -1) {
            System.out.print("For the " + getName() + " shelter no is invalid, enter again.  ");
        }

        return shelterNo;
    }

    public void setShelterNo(int shelterNo) {
        if (-1 < shelterNo && shelterNo < 1000) {
            this.shelterNo = shelterNo;
        } else {
            this.shelterNo = -1;
        }
    }

    public int getBadgeNo() {
        if (badgeNo == -1) {
            System.out.print("For the " + getName() + " badge no is invalid, enter again.  ");
        }
        return badgeNo;
    }

    public void setBadgeNo(int badgeNo) {
        if (-1 < badgeNo && badgeNo < 1000) {
            this.badgeNo = badgeNo;
        } else {
            this.badgeNo = -1;

        }
    }

    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        if (shelterNo == -1 || badgeNo == -1) {
            return false;
        } else {
            return getShelterNo() == felis.getShelterNo() && getBadgeNo() == felis.getBadgeNo();
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShelterNo(), getBadgeNo());
    }
}
