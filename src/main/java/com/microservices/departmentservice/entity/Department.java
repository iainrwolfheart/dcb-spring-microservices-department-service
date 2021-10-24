package com.microservices.departmentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "departments")
public class Department {

    @Id
    @GeneratedValue
    @BsonProperty("_id")
    private ObjectId departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

}
