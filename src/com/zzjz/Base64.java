package com.zzjz;

import java.io.IOException;
import java.io.Serializable;

public class Base64 implements Serializable {
    static {
        try {
            NativeLibLoader.initBase64();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Base64() {
    }

    public native static String encode(String data);

    public native static String decode(String data);

    public static void main(String[] args) {
        System.out.println(Base64.encode("test_string"));
        System.out.println(Base64.decode("dGVzdF9zdHJpbmc="));
    }
}
