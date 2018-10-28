package de.mschneid.microservices.currencyconversionservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RabbitTestMessage implements Serializable {


    private Integer id;
    private String firstName;
    private String lastName;
}
