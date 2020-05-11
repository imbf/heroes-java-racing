package model;

import util.RandomNumberGenerator;

import java.util.Comparator;
import java.util.List;

public class RacingGame {

    private static final int CRITERIA_NUMBER = 4;
    private static final int RANDOM_INTEGER_RANGE = 10;

    private int attemptNumber;
    private List<Car> cars;

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setGame(int attemptNumber, List<Car> cars) {
        this.attemptNumber = attemptNumber;
        this.cars = cars;
    }

    public void start() {
        for (int count = 0; count < attemptNumber; count++) {
            proceedOnce(RandomNumberGenerator.createRandomNumbers(cars.size(), RANDOM_INTEGER_RANGE));
        }
    }

    private void proceedOnce(List<Integer> randomIntegers) {
        for (int index = 0; index < cars.size(); index++) {
            cars.get(index).move(randomIntegers.get(index), CRITERIA_NUMBER);
        }
    }

    public List<Car> getWinnerCars() {
        int maxLocation = cars.stream().max(Comparator.comparingInt(Car::getLocation)).get().getLocation();
        cars.removeIf(winnerCar -> winnerCar.getLocation() != maxLocation);
        return cars;
        mock()
    }
}

