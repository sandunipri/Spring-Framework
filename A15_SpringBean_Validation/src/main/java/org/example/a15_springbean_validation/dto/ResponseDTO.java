package org.example.a15_springbean_validation.dto;

public class ResponseDTO {
    private String name;
    private int statusCode;
    private Object data;

    public ResponseDTO() {
    }

    public ResponseDTO(String name, int statusCode, Object data) {
        this.name = name;
        this.statusCode = statusCode;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "name='" + name + '\'' +
                ", statusCode=" + statusCode +
                ", data=" + data +
                '}';
    }
}
