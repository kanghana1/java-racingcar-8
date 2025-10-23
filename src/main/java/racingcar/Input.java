package racingcar;

public class Input {
    private String name;
    private int tryCnt;

    public Input(String name, int tryCnt) {
        this.name = name;
        this.tryCnt = tryCnt;
    }

    public String getName() {
        return name;
    }

    public int getTryCnt() {
        return tryCnt;
    }
}
