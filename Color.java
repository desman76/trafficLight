package ru.lessons.Pavel.trafficLight;

 abstract class Color{
    private String name;
    private int seconds;

    abstract void toBurn();

    void pause(){
        try {
            Thread.sleep(getSeconds());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds * 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 }
