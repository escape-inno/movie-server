package inno.escape.movieserver.domain.movie.repository;

import inno.escape.movieserver.domain.movie.entity.Movie;
import inno.escape.movieserver.domain.movie.entity.MovieCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieCompanyRepository extends JpaRepository<MovieCompany, String> {

    List<MovieCompany> findByMovie(Movie movie);
}
