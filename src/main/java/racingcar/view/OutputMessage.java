package racingcar.view;

public enum OutputMessage {
    RACING_MESSAGE("실행결과"),
    RACING_PROGRESS_INFO_MESSAGE("%s : %s\n"),
    ;

    public final String content;

    OutputMessage(String content) {
        this.content = content;
    }
}
