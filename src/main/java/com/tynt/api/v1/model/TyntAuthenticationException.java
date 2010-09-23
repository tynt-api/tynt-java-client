package com.tynt.api.v1.model;

/**
 * Models a Tynt API server-side error.
 *
 * @author Bryan Sant <bryan@tynt.com>
 */
public class TyntAuthenticationException extends TyntApiException {
    public TyntAuthenticationException(int errorCode, String message) {
        super(errorCode, message, null);
    }
}
