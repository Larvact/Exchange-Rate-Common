package toby.exchangerate.common.data;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;
import java.util.function.Function;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DataTransformationUtils
{
    public static <T, S> T orElse(S object, Function<S, T> mapping, T defaultValue)
    {
        return Optional.ofNullable(object)
                .map(mapping)
                .orElse(defaultValue);
    }
}
