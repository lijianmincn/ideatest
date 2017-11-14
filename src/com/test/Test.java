package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jianmin on 2017/11/13.
 */
public class Test {
    public static void main(String[] args){
        Arrays.asList(1,2,3).forEach(x->{
            System.out.println(x + ":theadId:" + Thread.currentThread().getId());
        });
        System.out.println("********************************************");
        Arrays.asList(1,2,3).parallelStream().forEach(x->{
            System.out.println(x + ":theadId:" + Thread.currentThread().getId());
        });
    }
}
