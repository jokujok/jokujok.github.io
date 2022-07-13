package com.crud.tasks.repository;

import com.crud.tasks.domain.Task;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.metamodel.SingularAttribute;
import java.io.Serializable;
import java.util.List;

public interface TaskRepository extends CrudRepository<Task, Long> {
    List<Task> findAll();

}
