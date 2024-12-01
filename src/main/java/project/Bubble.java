package project;

public class Bubble {

    private String name;

    private int volume;

    public Bubble(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
