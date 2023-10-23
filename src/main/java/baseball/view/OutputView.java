package baseball.view;

public class OutputView {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String GAME_END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String COMPLETELY_EXIT_MESSAGE = "숫자 야구 게임을 종료합니다.";

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printHintMessage(String hint) {
        System.out.println(hint);
    }

    public static void printEndMessage() {
        System.out.println(GAME_END_MESSAGE);
    }

    public static void printCompletelyEndMessage() {
        System.out.println(COMPLETELY_EXIT_MESSAGE);
    }

}
