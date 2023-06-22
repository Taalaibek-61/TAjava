package org.example.Seminar1.HomeWork.Ex_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String name;
    private String surname;
    private Integer prise;
    private Integer year;
    private Integer count;


}
