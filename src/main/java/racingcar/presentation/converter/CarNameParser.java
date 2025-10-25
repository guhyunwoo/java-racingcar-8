package racingcar.presentation.converter;

public class CarNameParser {
    private final String DELIMITER = ",";

    public String[] parseCarName(String carNameCsv) {
        return carNameCsv.split(DELIMITER);
    }
}
