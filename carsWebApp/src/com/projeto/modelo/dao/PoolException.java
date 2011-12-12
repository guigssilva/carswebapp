package com.projeto.modelo.dao;

public class PoolException extends RuntimeException {
    private static final String STANDARD_EXCEPTION_MESSAGE =
            "Pool property not set";

    public PoolException(String msg) {
        super(STANDARD_EXCEPTION_MESSAGE + ":" + msg);
    }
}