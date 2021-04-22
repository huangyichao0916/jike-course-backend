package com.hyc.utils;

import org.junit.Test;

import java.io.Serializable;

public class TestJsonUtils {
    @Test
    public void testOne(){
        Person person = new Person(1, "123");
        System.out.println(JsonUtils.getResultJson(2,person));
    }
}

class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}