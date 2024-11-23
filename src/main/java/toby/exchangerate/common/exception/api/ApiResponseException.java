package toby.exchangerate.common.exception.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@RequiredArgsConstructor
public class ApiResponseException extends RuntimeException
{
    private final String message;
    private final Throwable cause;
    private final HttpStatus httpStatus;
    private final Instant timestamp;
}
