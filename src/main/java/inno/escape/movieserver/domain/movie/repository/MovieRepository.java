package inno.escape.movieserver.domain.movie.repository;

import inno.escape.movieserver.domain.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

    Movie findByCode(String movieCd);
}
