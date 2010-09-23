package com.tynt.api.v1.model;

/**
 * Models a Tynt API server-side error.
 *
 * @author Bryan Sant <bryan@tynt.com>
 */
public class TyntApiException extends Exception {
    private int errorCode;

    public TyntApiException(int errorCode, String message) {
        this(errorCode, message, null);
    }


    public TyntApiException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
