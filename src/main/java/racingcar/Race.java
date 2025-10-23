package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Race {

    private List<Car> participants = new ArrayList<>();
    private OutputPrinter outputPrinter;

    public Race(String users) {
        parseUser(users);
        outputPrinter = new OutputPrinter();
    }

    public void startRacing(int tryCnt) {
        System.out.println("실행 결과");
        for (int i = 0 ; i < tryCnt ; i++) {
            this.startPerRacing();
        }
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

    private void startPerRacing() {
        for (Car car : participants) {
            car.canGo();
            outputPrinter.printPerRaceResult(car);
        }
        System.out.println();
    }

    private void parseUser(String users) {
        participants = Arrays.stream(users.trim().split(","))
                .map(str -> {
                    if (str.trim().length() > 5) {
                        throw new IllegalArgumentException("이름이 5글자를 초과했습니다.");
                    }
                    return new Car(str.trim());
                })
                .collect(Collectors.toList());
    }
}
