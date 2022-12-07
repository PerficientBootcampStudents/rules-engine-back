package com.rulesback.rulesback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TupleDTO {
    
    private UUID id;

    private String column1;

    private String column2;

    private String column3;

    private String column4;
}
