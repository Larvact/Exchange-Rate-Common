package toby.exchangerate.common.exception.api;

public class ApiMalformedRequestException extends RuntimeException
{
    public ApiMalformedRequestException(final String message)
    {
        super(message);
    }
}
