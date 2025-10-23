package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputPrinter inputPrinter = new InputPrinter();
        Input inputDto = inputPrinter.getInputDto();

        Race race = new Race(inputDto.getName());
        race.startRacing(inputDto.getTryCnt());
        race.winnerAnnouncement();
    }
}
