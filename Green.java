package ru.lessons.Pavel.trafficLight;

public class Green extends Color {

    public Green(String name) {
        setName(name);
    }

    @Override
    public void toBurn() {
        System.out.println("Green light is on " + getSeconds()/1000 + " seconds");
        pause();
    }

}
