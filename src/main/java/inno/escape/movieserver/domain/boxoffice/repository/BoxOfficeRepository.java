package inno.escape.movieserver.domain.boxoffice.repository;


import inno.escape.movieserver.domain.boxoffice.entity.BoxOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxOfficeRepository extends JpaRepository<BoxOffice, String> {

}