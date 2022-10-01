package com.example.bs41;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("profile1")
public class Profile1 implements ProfileInterface {
    private String profile = "perfil2";

    @Override
    public String miFuncion() {
        return this.profile;
    }
}
