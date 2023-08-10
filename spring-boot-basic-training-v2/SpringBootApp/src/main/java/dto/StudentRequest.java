package dto;

import lombok.Getter;

@Getter
public class StudentRequest {
    private String id;
    private String name;
    private String dateOfBirth;
    private double average;

}
