package com.example.cities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class City {

    @Id
    private String id;

    private String name;
    private String country;
    private double longitude;
    private double latitude;
    private long population;

}
