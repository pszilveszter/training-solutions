package week08d01;

public class Robot {
    private String name;
    private Coordinates cords;

    public Robot(String name, Coordinates cords) {
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Name is compulsory");
        }
        this.name = name;
        this.cords = cords;
    }


    public Coordinates move(String command) {
        if (isEmpty(command)) {
            throw new IllegalArgumentException("Control obeject is missing");
        }
        Coordinates stepCoords = new Coordinates(cords.getX(), cords.getY());
        char[] steps = command.toUpperCase().toCharArray();
        for (char step: steps) {
            switch (step) {
                case 'F':
                    stepCoords.moveUp();
                    break;
                case 'L':
                    stepCoords.moveDown();
                    break;
                case 'J':
                    stepCoords.moveRight();
                    break;
                case 'B':
                    stepCoords.moveLeft();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid command found");
            }
        }
        cords = stepCoords;
        return cords;
    }


    public String getName() {
        return name;
    }

    public Coordinates getCords() {
        return cords;
    }



    private boolean isEmpty(String command) {
        return command == null || command.isBlank();
    }

}
