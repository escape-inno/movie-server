package inno.escape.movieserver.domain.movie.mapper;

import inno.escape.movieserver.domain.movie.entity.MovieGenre;
import inno.escape.movieserver.global.model.dto.GenreDto;
import inno.escape.movieserver.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenreResponseMapper extends GenericMapper<GenreDto, MovieGenre> {

    GenreResponseMapper INSTANCE = Mappers.getMapper(GenreResponseMapper.class);
}
