package racingcar.util.converter;

public interface Converter<S, T> {
    T convert(S input);
}
