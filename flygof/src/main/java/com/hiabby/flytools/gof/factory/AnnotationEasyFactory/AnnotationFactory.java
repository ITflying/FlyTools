package com.hiabby.flytools.gof.factory.AnnotationEasyFactory;

public class AnnotationFactory {
    public static void executeOpeartoryByTag(String tag) {
        String className = "com.hiabby.flytools.gof.factory.AnnotationEasyFactory" + "." + tag + "Operator";

        try {
            Opeartory opeartory = (Opeartory) Class.forName(className).newInstance();
            opeartory.executeOpeart();
            ;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("类型不符合要求");
        }

    }
}
