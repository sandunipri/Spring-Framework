package org.example.dto;

public class CustomerDTO {
    private String FirstName;
    private String LastName;
    private int age;


    public CustomerDTO() {
    }

    public CustomerDTO(String firstName, String lastName, int age) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
