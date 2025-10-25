package racingcar.domain;

import racingcar.error.ErrorMessage;

public class CarName {
    private final String name;

    private final Integer MIN_NAME_LENGTH = 5;

    public CarName(String name) {
        validateNameLength(name);
        validateNameNotEmpty(name);

        this.name = name;
    }

    private void validateNameLength(String name) {
        if (name.length() > MIN_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_TOO_LONG.content);
        }
    }

    private void validateNameNotEmpty(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_EMPTY.content);
        }
    }

    public String getName() {
        return name;
    }
}
