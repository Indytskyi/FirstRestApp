package com.project.indytskyi.FirstRestApp.util;

public class PersonNotCreatedException extends RuntimeException{
    public PersonNotCreatedException(String msg) {
        super(msg);
    }
}
