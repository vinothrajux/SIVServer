package com.sivserver.example.utils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Seetha on 15-Jun-17.
 */
public class SivUtils {
    public static boolean isUserLoggedIn(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(null == auth.getPrincipal() || auth.getPrincipal().toString().contentEquals("anonymousUser")){
            return false;
        } else {
            return true;
        }
    }
    /**
     * Apply sha-512
     * digest the string
     * generate the string
     *
     * @param hashString the string which is going to be used for generating hash
     * @return hash
     */
    public static String calculateHash(String hashString) {
        try {
            StringBuilder hash = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
            messageDigest.update(hashString.getBytes());
            byte[] mdbytes = messageDigest.digest();
            for (byte hashByte : mdbytes) {
                hash.append(Integer.toString((hashByte & 0xff) + 0x100, 16).substring(1));
            }
            return hash.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
