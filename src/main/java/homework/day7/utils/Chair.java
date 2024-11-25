package homework.day7.utils;

import java.util.Objects;

public class Chair {

    private int height;

    private int width;

    public Chair(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getName() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return height == chair.height && Objects.equals(width, chair.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "age=" + height +
                ", name='" + width + '\'' +
                '}';
    }
}
