package com.kazemi.home_services_company.enums;

import lombok.Getter;

/**
 * @author fh.kazemi
 **/

@Getter
public enum ServicesType {
    DECORATION_BUILDING(0, "decoration_building", "دکوراسیون ساختمان"),
    FACILITIES_BUILDING(1, "facilities_building", "تأسیسات ساختمان"),
    VEHICLES(2, "vehicles", "وسیله نقلیه"),
    FREIGHT(3, "freight", "اسباب کشی و باربری"),
    HOME_APPLIANCES(4, "home_appliances", "لوازم خانگی"),
    CLEANING_AND_HYGIENE(5, "cleaning_and_hygiene", "نظافت و بهداشت"),
    UNKNOWN(6, "unknown", "سرویس نامعلوم");

    private final Integer index;
    private final String title;
    private final String persianTitle;

    ServicesType(Integer index, String title, String persianTitle) {
        this.index = index;
        this.title = title;
        this.persianTitle = persianTitle;
    }

    public static ServicesType valueOfIndex(Integer index) {
        for (ServicesType type : values()) {
            if (type.index.equals(index)) {
                return type;
            }
        }
        return null;
    }
}
