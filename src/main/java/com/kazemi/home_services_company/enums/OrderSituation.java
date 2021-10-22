package com.kazemi.home_services_company.enums;

import lombok.Getter;

/**
 * @author fh.kazemi
 **/

@Getter
public enum OrderSituation {
    WAITING_FOR_EXPERT_SUGGESTIONS(0, "waiting_for_expert_suggestions", "در انتظار برای پیشنهاد متخصص"),
    WAITING_FOR_EXPERT_SELECTION(1, "waiting_for_expert_selection", "در انتظار برای انتخاب متخصص"),
    WAITING_FOR_EXPERT_TO_COME(2, "waiting_for_expert_to_come", "در انتظار برای آمدن متخصص"),
    STARTED(3, "started", "شروع"),
    DONE(4, "done", "انجام شد"),
    PAID(5, "paid", "پرداخت شد"),
    FINISHED(6, "finish", "پایان"),
    UNKNOWN(7, "unknown", "سفارش نامعلوم");

    private final Integer index;
    private final String title;
    private final String persianTitle;

    OrderSituation(Integer index, String title, String persianTitle) {
        this.index = index;
        this.title = title;
        this.persianTitle = persianTitle;
    }

    public static OrderSituation valueOfIndex(Integer index) {
        for (OrderSituation situation : values()) {
            if (situation.index.equals(index)) {
                return situation;
            }
        }
        return null;
    }
}
