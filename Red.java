package ru.lessons.Pavel.trafficLight;

class Red extends Color {

    Red(String name) {
        setName(name);
    }

    @Override
    void toBurn() {
        System.out.println("Red light is on " + getSeconds() / 1000 + " seconds");
        pause();
    }
}
