package racingcar.presentation.converter;

public interface Converter<S, T> {
    T convert(S input);
}
