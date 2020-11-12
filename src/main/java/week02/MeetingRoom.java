package week02;

public class MeetingRoom {
    private String name;
    private int lenght;
    private int width;

    public MeetingRoom(String name, int lenght, int width) {
        this.name = name;
        this.lenght = lenght;
        this.width = width;

    }

    public int getArea() {
        return lenght * width;
    }


    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
