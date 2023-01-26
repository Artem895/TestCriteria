package com.mytest.repo;

import com.mytest.entity.DataBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DataBaseEntityRepository extends JpaRepository<DataBaseEntity,Long>, JpaSpecificationExecutor<DataBaseEntity> {
}
