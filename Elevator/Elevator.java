package Elevator;

public class Elevator {
    private int currentFloor;
    private int capacity;
    private int maxFloor;

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
        capacity = 200;
        maxFloor = 18;
    }

    public void move(int toFloor) {
        while (currentFloor != toFloor) {
            step(toFloor);
        }
        printFloor();
    }

    private void step(int toFloor) {
        printFloor();
        if (currentFloor < toFloor) {
            currentFloor++;
        }
        if (currentFloor > toFloor) {
            currentFloor--;
        }
    }

    public boolean isAllowableWeight(int weight) {
        return weight <= capacity && weight > 0;
    }

    public boolean isAllowableFloor(int floor) {
        return floor <= maxFloor && floor > 0;
    }

    private void printFloor() {
        System.out.println("Current floor: " + currentFloor);
    }
}
