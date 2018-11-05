package com.zlf.practice.test;

import com.zlf.practice.entity.RemittanceApplicationDetail;
import com.zlf.practice.entity.SystemClearingConfig;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author zhanglf
 */
public class ReflectionTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

//    System.out.println("test========"+invokeMethod(new SystemClearingConfig(),"getDayTime","aa"));

        for (int i=0; i<10;i++){
            System.out.println("i========"+(i+1));
        }

    }


    public static Object invokeMethod(Object obj, String methodName,Object... paramters) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class[] paramterTypes = new Class[paramters.length];

        for (int i=0;i<paramters.length;i++){
            paramterTypes[i] = paramters[i].getClass();
        }
        Method method = obj.getClass().getDeclaredMethod(methodName,paramterTypes);
       return method.invoke(obj,paramters);
    }

}
