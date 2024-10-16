package com.github.eykemesquita.customer_api.domain.model;

public enum SapSyncStatus {
    SUCCESS(0),
    PENDING(1),
    ERROR(2);

    private final int code;

    SapSyncStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static SapSyncStatus fromCode(int code) {
        for (SapSyncStatus status : SapSyncStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid SapSyncStatus code: " + code);
    }
}