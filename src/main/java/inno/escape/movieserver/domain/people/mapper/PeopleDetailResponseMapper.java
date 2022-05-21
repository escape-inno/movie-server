package inno.escape.movieserver.domain.people.mapper;

import inno.escape.movieserver.domain.people.dto.PeopleDetailResponseDto;
import inno.escape.movieserver.domain.people.entity.People;
import inno.escape.movieserver.global.model.mapper.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PeopleDetailResponseMapper extends GenericMapper<PeopleDetailResponseDto, People> {

    PeopleDetailResponseMapper INSTANCE = Mappers.getMapper(PeopleDetailResponseMapper.class);
}
