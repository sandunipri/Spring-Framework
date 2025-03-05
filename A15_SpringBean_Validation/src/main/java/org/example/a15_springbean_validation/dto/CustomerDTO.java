package org.example.a15_springbean_validation.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CustomerDTO {

    @NotBlank(message = "name is required")
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "name should contain only Letters and spaces")
    @Size(min = 2, max = 30, message = "name should contain 2 to 30 characters")
    private String name;

    @Email(message = "invalid Email")
    private String email;

    @Pattern(regexp = "^[0-9]{10}$", message = "phone number should contain 10 digits")
    private String phoneNumber;

    public CustomerDTO() {
    }

    public CustomerDTO(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
