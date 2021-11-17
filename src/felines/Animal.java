package felines;

public abstract class Animal {

    protected static int animalCount;
    private char size;
    private char coat;
    private String color;
    private double weight;

    {
        if(isAlive()){
            animalCount++;

    }}


    public void makeNoise(String sound){}
    public void eat(){}
    public void sleep(){}
    public boolean isAlive(){
        return true;
    }



}
