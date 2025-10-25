package racingcar.domain;

public class Position {
    private final String value;
    private static final String ADVANCED_POSITION_EXPRESSION = "-";

    public static Position start() {
        return new Position("");
    }

    private Position(String value) {
        this.value = value;
    }

    public Position advance() {
        return new Position(ADVANCED_POSITION_EXPRESSION);
    }

    public String getValue() {
        return value;
    }
}
