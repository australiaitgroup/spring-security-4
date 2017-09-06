package com.jiangren.j2ee.ss.springsecurity4demo.utils;

import org.apache.tomcat.util.codec.binary.Base64;

/**
 * Created by seabook on 6/9/17.
 */
public class Base64CredentialsUtil  {

    public static void main(String... args) {
        String plainClientCredentials="admin:password";
        String base64ClientCredentials = new String(Base64.encodeBase64(plainClientCredentials.getBytes()));

        System.out.println("Authorization Basic " + base64ClientCredentials);

    }
}
