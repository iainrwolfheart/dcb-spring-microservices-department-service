package com.microservices.departmentservice.repository;

import com.microservices.departmentservice.entity.Department;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, ObjectId> {

    @Query(value="{'_id' : ?0 }")
    Department findByDepartmentId(String departmentId);
}
