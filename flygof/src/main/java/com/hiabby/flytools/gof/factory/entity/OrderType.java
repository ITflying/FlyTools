package com.hiabby.flytools.gof.factory.entity;

import java.util.ArrayList;
import java.util.List;

public enum OrderType {

    ORDER("Order", "订单"),

    RECEIVED("Received", "入库单");

    private String value;
    private String label;

    OrderType(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    /**
     * 得到所有包含的枚举类型的集合
     *
     * @return value 的集合
     */
    public static List<String> getValues() {
        List<String> values = new ArrayList<>();
        for (OrderType status : OrderType.values()) {
            values.add(status.getValue());
        }
        return values;
    }

    /**
     * 由value 拿到 label
     *
     * @param value value
     * @return type
     */
    public static String getLabelByValue(String value) {
        for (OrderType status : OrderType.values()) {
            if (status.getValue().equals(value)) {
                return status.getLabel();
            }
        }
        return null;
    }
}