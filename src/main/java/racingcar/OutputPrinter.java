package racingcar;

import java.util.List;

public class OutputPrinter {
    public void printPerRaceResult(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0 ; i < car.getWinCount() ; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void finalResult(List<Car> winners) {
        System.out.print("최종 우승자 : ");
        for (Car car : winners) {
            System.out.print(car.getName() + ", ");
        }
        System.out.println("\b\b");
    }
}
