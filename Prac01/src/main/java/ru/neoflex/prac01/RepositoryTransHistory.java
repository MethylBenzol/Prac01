package ru.neoflex.prac01;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryTransHistory extends JpaRepository<TableTransHistory, Long>{

}
