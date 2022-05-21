package inno.escape.movieserver.domain.movie.service;

import inno.escape.movieserver.domain.movie.dto.MovieDetailResponseDto;
import inno.escape.movieserver.domain.movie.service.impl.MovieServiceImpl;

import java.util.List;

public interface MovieService {

    List<MovieDetailResponseDto> getMovies();

    MovieDetailResponseDto getMovie(String code);

    List<MovieDetailResponseDto> getFilmoByPeople(String peopleCode);

//    List<MovieDetailResponseDto> getFilmoByCompany(String );
}
