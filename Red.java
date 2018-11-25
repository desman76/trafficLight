package ru.lessons.Pavel.trafficLight;

public class Red extends Color {

    public Red(String name) {
        setName(name);
    }

    @Override
    void toBurn() {
        System.out.println("Red light is on " + getSeconds()/1000 + " seconds");
        pause();
    }

}
