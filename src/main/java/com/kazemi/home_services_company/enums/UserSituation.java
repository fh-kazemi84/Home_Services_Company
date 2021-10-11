package com.kazemi.home_services_company.enums;

import lombok.Getter;

/**
 * @author fh.kazemi
 **/

@Getter
public enum UserSituation {
    NEW(0, "new", "جدید"),
    AWAITING_APPROVAL(1, "awaiting approval", "در انتظار تأیید"),
    APPROVAL(2, "approval", "تأیید شده");

    private final Integer index;
    private final String title;
    private final String persianTitle;

    UserSituation(Integer index, String title, String persianTitle) {
        this.index = index;
        this.title = title;
        this.persianTitle = persianTitle;
    }

    public static UserSituation valueOfIndex(Integer index) {
        for (UserSituation situation : values()) {
            if (situation.index.equals(index)) {
                return situation;
            }
        }
        return null;
    }
}
