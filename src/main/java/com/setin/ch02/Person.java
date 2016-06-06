package com.setin.ch02;

/**
 * Created by 두석 on 2016-06-06.
 */
public class Person {
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void doIt() {
        this.role.doIt();
    }

}

