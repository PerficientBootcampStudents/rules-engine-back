package com.rulesback.rulesback.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Data;


@Data
@Entity
public class Tuple {

        @Id
        @Type(type="uuid-char")
        private UUID id;
        
        private String column1;
        
        private String column2;
        
        private String column3;
        
        private String column4;
}
