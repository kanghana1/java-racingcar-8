package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Race {

    private List<Car> participants;
    private OutputPrinter outputPrinter;

    public Race(String users) {
        parseUser(users);
        outputPrinter = new OutputPrinter();
    }

    public void startRacing() {
        for (Car car : participants) {
            car.canGo();
            outputPrinter.printPerRaceResult(car);
        }
        System.out.println();
    }

    private void parseUser(String users) {
        participants = Arrays.stream(users.trim().split(","))
                .map(str -> new Car(str.trim()))
                .toList();
    }
}
