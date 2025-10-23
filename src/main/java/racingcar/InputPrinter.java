package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputPrinter {

    public Input getInputDto() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)");
        String users = Console.readLine();
        System.out.println("시도할 횟수는 몇 회인가요?");
        int tryCount = 0;
        try {
            tryCount = Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도할 횟수는 정수만 입력 가능합니다.");
        }

        System.out.println();

        return new Input(users, tryCount);
    }
}
