package com.sivserver.example.config;

import com.sivserver.example.utils.SivUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by Seetha on 15-Jun-17.
 */
public class SIVPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        // our custom encoder
        return SivUtils.calculateHash(rawPassword.toString());
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return SivUtils.calculateHash(rawPassword.toString()).contentEquals(encodedPassword);
    }
}
