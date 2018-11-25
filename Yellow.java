package ru.lessons.Pavel.trafficLight;

public class Yellow extends Color {

    public Yellow(String name) {
        setName(name);
    }

    @Override
    public void toBurn() {
        System.out.println("Yellow light is on " + getSeconds()/1000 + " seconds");
        pause();
    }

}
