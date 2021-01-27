package com.ss.basics.pets;

public class Pets implements Comparable<Pets> {
    
    private Integer age;
    private String breed;
    private Double popularity;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(Integer age) {
        this.breed = breed;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setAge(Double popularity) {
        this.popularity = popularity;
    }

    public Pets(Integer age, String breed, Double popularity) {
        super();
        this.age = age;
        this.breed = breed;
        this.popularity = popularity;
    }
    @Override
    public int compareTo(Pets var1) {
        return this.popularity - var1.popularity;
    }

}
