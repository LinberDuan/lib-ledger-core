// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from errors.djinni

package co.ledger.core;

public final class Error {


    /*package*/ final ErrorCode code;

    /*package*/ final String message;

    public Error(
            ErrorCode code,
            String message) {
        this.code = code;
        this.message = message;
    }

    public ErrorCode getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Error{" +
                "code=" + code +
                "," + "message=" + message +
        "}";
    }

}
