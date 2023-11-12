package com.graphqldemo.movies.graphql;

public class ActorInput {
    private String id;
    private String name;
    private String age;
    private String country;

    public ActorInput() {}

    public ActorInput(String id, String name, String age, String country) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
