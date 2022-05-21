package inno.escape.movieserver.domain.movie.repository;

import inno.escape.movieserver.domain.movie.entity.Movie;
import inno.escape.movieserver.domain.movie.entity.MoviePeople;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviePeopleRepository extends JpaRepository<MoviePeople, String> {

    List<MoviePeople> findByMovie(Movie movie);



}
