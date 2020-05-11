package util;

import exception.OutOfCarNameLengthException;
import model.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConverter {

    public static List<Car> convertCarNamesToCarList(String carNames) throws OutOfCarNameLengthException {
        String[] carNameArray = carNames.split(",");
        for (String carName : carNameArray) {
            inspectCarNameLength(carName);
        }
        return Stream.of(carNameArray).map(Car::new).collect(Collectors.toList());
    }

    private static void inspectCarNameLength(String carName) throws OutOfCarNameLengthException {
        if (carName.length() > 5) {
            throw new OutOfCarNameLengthException("자동차 이름은 5글자 이하여야 합니다.");
        }
    }
}
