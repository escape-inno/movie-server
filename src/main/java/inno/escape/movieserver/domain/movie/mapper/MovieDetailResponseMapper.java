package inno.escape.movieserver.domain.movie.mapper;

import inno.escape.movieserver.domain.movie.dto.MovieDetailResponseDto;
import inno.escape.movieserver.domain.movie.entity.Movie;
import inno.escape.movieserver.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieDetailResponseMapper extends GenericMapper<MovieDetailResponseDto, Movie> {

    MovieDetailResponseMapper INSTANCE = Mappers.getMapper(MovieDetailResponseMapper.class);
}
