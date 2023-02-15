package org.example.lesson_one.exercise_one;

public class Person extends Builder{


    public Person(String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender) {
        super(firstName, lastName, middleName, country, address, phone, age, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
