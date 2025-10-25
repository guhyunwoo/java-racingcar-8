package racingcar.domain;

public class RaceProgress {
    private String positon;

    private final String DEFAULT_POSITION = "";
    private final String ADVANCED_POSITION_EXPRESSION = "-";

    public RaceProgress() {
        this.positon = DEFAULT_POSITION;
    }

    public void advance() {
        positon += ADVANCED_POSITION_EXPRESSION;
    }

    public String getPosition() {
        return positon;
    }
}
