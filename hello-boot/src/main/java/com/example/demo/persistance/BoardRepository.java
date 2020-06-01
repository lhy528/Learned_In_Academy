package com.example.demo.persistance;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.dto.TestDTO;

// 영속성 개체 > DB들어가서 CRUD작업 해야함
public interface BoardRepository extends CrudRepository<TestDTO, Long>{

}
