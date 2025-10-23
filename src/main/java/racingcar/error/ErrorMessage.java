package racingcar.error;

public enum ErrorMessage {
    INVALID_INPUT_MESSAGE("잘못된 입력입니다."),
    ;

    public final String content;

    ErrorMessage(String content) {
        this.content = content;
    }
}
