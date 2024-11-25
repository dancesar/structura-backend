package com.structura.application.core.domain;

import java.time.LocalDateTime;
import java.util.Set;

public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private String paper;
    private Boolean isActive;
    private LocalDateTime dtCreate;
    private LocalDateTime dtUpdate;
    private Set<Role> roles;

}
