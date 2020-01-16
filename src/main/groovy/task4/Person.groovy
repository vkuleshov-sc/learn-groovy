package task4

class Person {
    private String firstName
    private String surName
    private Integer age
    private Address address

    String toString() {
        "${surName} ${firstName}"
    }

    Integer plus(Person object){
        return this.age + object.age
    }

    Integer minus(Person object) {
        return this.age - object.age
    }
}