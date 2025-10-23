package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Race {

    private List<Car> participants = new ArrayList<>();
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

    public void winnerAnnouncement() {
        Collections.sort(participants);

        List<Car> winners = new ArrayList<>();
        winners.add(participants.get(0));
        int idx = 1;
        while (idx < participants.size()) {
            if (participants.get(idx).getWinCount() < participants.get(0).getWinCount()) {
                break;
            }
            winners.add(participants.get(idx));
            idx++;
        }
        outputPrinter.finalResult(winners);
    }

    private void parseUser(String users) {
        participants = Arrays.stream(users.trim().split(","))
                .map(str -> new Car(str.trim()))
                .collect(Collectors.toList());
    }

}
