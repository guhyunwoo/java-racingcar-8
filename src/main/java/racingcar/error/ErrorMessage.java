package racingcar.error;

public enum ErrorMessage {
    INVALID_INPUT("잘못된 입력입니다."),
    CAR_NAME_TOO_LONG("자동차 이름은 5자 이하여야 합니다."),
    CAR_NAME_EMPTY("자동차 이름이 비어있습니다."),
    ;

    public final String content;

    ErrorMessage(String content) {
        this.content = content;
    }
}
