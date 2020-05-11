package util;

import exception.OutOfCarNameLengthException;
import model.Car;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test(expected = OutOfCarNameLengthException.class)
    public void 여섯글자이상의_이름이_들어왔을때_예외테스트() throws OutOfCarNameLengthException {
        StringConverter.convertCarNamesToCarList("pobi,crong,honux,keroro");
    }

    @Test
    public void 다섯글자이하의_이름이_들어왔을때_정테스트() throws OutOfCarNameLengthException {
        StringConverter.convertCarNamesToCarList("pobi,crong,honux");
    }

    @Test
    public void convertCarNamesToCarListTest() throws OutOfCarNameLengthException {
        List<Car> carsTest = Arrays.asList(new Car[]{
                new Car("pobi"),
                new Car("crong"),
                new Car("honux")
        });
        List<Car> cars = StringConverter.convertCarNamesToCarList("pobi,crong,honux");
        for (int index = 0; index < cars.size(); index++) {
            assertEquals(cars.get(index).getName(), carsTest.get(index).getName());
            assertEquals(cars.get(index).getLocation(), carsTest.get(index).getLocation());
        }
    }
}
