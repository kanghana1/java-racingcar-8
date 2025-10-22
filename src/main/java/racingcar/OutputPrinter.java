package racingcar;

public class OutputPrinter {
    public void printPerRaceResult(Car car) {
        System.out.print(car.getName() + " : ");
        for (int i = 0 ; i < car.getWinCount() ; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
