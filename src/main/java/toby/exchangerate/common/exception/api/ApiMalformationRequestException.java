package toby.exchangerate.common.exception.api;

public class ApiMalformationRequestException extends RuntimeException
{
    public ApiMalformationRequestException(final String message)
    {
        super(message);
    }
}
