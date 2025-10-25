package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {
    private final Integer value;
    private static final Integer START_INCLUSIVE = 0;
    private static final Integer END_INCLUSIVE = 9;
    private static final Integer CRITERION = 4;

    public RandomNumber() {
        this.value = Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
    }

    public Boolean isMoreThanCriterion() {
        return value >= CRITERION;
    }
}
