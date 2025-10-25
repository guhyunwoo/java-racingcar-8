package racingcar.util;

public interface Converter<S, T> {
    T convert(S input);
}
