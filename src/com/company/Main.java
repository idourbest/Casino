package com.company;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Casino casino = new Casino();

        Method[] methods = casino.getClass().getDeclaredMethods();

        for (Method method : methods) {

            method.setAccessible(true);
            Annotation[] annotations = method.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {

                if (annotation instanceof Workable) {

                    try {
                        method.invoke(casino);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

