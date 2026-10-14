package org.example.model;

public abstract class BaseTree implements Tree {
    private final String speciesName;
    private final int age;

    public BaseTree(String speciesName, int age) {
        this.speciesName = speciesName;
        this.age = age;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSpeciesName() {
        return speciesName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " (Species name: " + speciesName + ", Age: " + age + " years)";
    }
}