package model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private static final int MOVING = 1;
    private static final int NOT_MOVING = 0;
    private static final int LAST_INDEX_ADJUSTMENT = -1;

    private String name;
    private List<Integer> movingStatuses;

    public Car(String name) {
        this.name = name;
        movingStatuses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMovingStatuses() {
        return movingStatuses;
    }

    public int getLocation() {
        return movingStatuses.stream().mapToInt(movingStatus -> movingStatus).sum();
    }

    public void move(int randomNumber, int criteriaNumber) {
        movingStatuses.add(NOT_MOVING);
        if (randomNumber >= criteriaNumber) {
            movingStatuses.remove(movingStatuses.size() + LAST_INDEX_ADJUSTMENT);
            movingStatuses.add(MOVING);
        }
    }
}