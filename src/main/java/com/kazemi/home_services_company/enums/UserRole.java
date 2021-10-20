package com.kazemi.home_services_company.enums;

import lombok.Getter;

/**
 * @author fh.kazemi
 **/

@Getter
public enum UserRole {
    CUSTOMER(0, "customer", "مشتری"),
    EXPERT(1, "expert", "متخصص"),
    ADMIN(2, "admin", "مدیر سیستم"),
    UNKNOWN(3, "unknown", "نقش نامعلوم");

    private final Integer index;
    private final String title;
    private final String persianTitle;

    UserRole(Integer index, String title, String persianTitle) {
        this.index = index;
        this.title = title;
        this.persianTitle = persianTitle;
    }

    public static UserRole valueOfIndex(Integer index) {
        for (UserRole role : values()) {
            if (role.index.equals(index)) {
                return role;
            }
        }
        return null;
    }
}
