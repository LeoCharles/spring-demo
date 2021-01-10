package com.leocode.bean;

public class Person {

    private String name;
    private Integer age;
    private String gender;

    public Person() {
        super();
        System.out.println("Person 无参构造创建...");
    }

    public Person(String name, Integer age, String gender) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Person 有参构造器创建...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
