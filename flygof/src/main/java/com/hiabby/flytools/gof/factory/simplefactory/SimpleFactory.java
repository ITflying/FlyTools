package com.hiabby.flytools.gof.factory.simplefactory;

public class SimpleFactory {
    public static void executeOpeartoryByTag(String tag) {
        switch (tag) {
            case "Order":
                new OrderOperator().executeOpeart();
                break;
            case "Received":
                new ReceivedOperator().executeOpeart();
                break;
            default:
                System.out.println("对应类型不存在");
                break;
        }
    }
}
