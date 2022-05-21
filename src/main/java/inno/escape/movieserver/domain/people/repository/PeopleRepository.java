package inno.escape.movieserver.domain.people.repository;

import inno.escape.movieserver.domain.people.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, String> {

    People findByCode(String code);
}
