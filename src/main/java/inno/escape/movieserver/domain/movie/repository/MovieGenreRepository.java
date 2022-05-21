package inno.escape.movieserver.domain.movie.repository;

import inno.escape.movieserver.domain.movie.entity.Movie;
import inno.escape.movieserver.domain.movie.entity.MovieGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieGenreRepository extends JpaRepository<MovieGenre, String> {

    List<MovieGenre> findByMovie(Movie movie);

}
