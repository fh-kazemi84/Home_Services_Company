package com.kazemi.home_services_company.enums;

import lombok.Getter;

/**
 * @author fh.kazemi
 **/

@Getter
public enum ExpertOffersSituation {
    ACCEPTED(0, "accepted", "پذیرفته شده"),
    REGISTERED(1, "registered", "ثبت شده"),
    EXPIRED(2, "expired", "منقضی شده"),
    REJECTED(3, "rejected", "رد شده"),
    DONE(4, "done", "انجام شده"),
    UNKNOWN(5, "unknown", "پیشنهاد نامعلوم");

    private final Integer index;
    private final String title;
    private final String persianTitle;

    ExpertOffersSituation(Integer index, String title, String persianTitle) {
        this.index = index;
        this.title = title;
        this.persianTitle = persianTitle;
    }

    public static ExpertOffersSituation valueOfIndex(Integer index) {
        for (ExpertOffersSituation situation : values()) {
            if (situation.index.equals(index)) {
                return situation;
            }
        }
        return null;
    }
}
