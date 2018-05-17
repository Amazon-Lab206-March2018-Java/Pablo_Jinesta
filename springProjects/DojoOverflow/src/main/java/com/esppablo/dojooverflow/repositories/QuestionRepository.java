package com.esppablo.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esppablo.dojooverflow.models.QuestionModel;

@Repository
public interface QuestionRepository extends CrudRepository<QuestionModel, Long>{
	List<QuestionModel> findAll();
}
