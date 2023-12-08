package com.database_systems.repository;


import com.database_systems.entity.Evaluator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;

@RepositoryDefinition(domainClass = Evaluator.class,idClass = Evaluator.class)
public interface EvaluatorRepository extends JpaRepository<Evaluator, Long> {
}
