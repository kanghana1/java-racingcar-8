package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private String name;
    private int winCount;

    public Car(String name) {
        this.name = name;
        this.winCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getWinCount() {
        return this.winCount;
    }


}
