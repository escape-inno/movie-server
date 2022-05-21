package inno.escape.movieserver.domain.people.service.impl;

import inno.escape.movieserver.domain.people.dto.PeopleDetailResponseDto;
import inno.escape.movieserver.domain.people.entity.People;
import inno.escape.movieserver.domain.people.mapper.PeopleDetailResponseMapper;
import inno.escape.movieserver.domain.people.repository.PeopleRepository;
import inno.escape.movieserver.domain.people.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PeopleServiceImpl implements PeopleService {

    private final PeopleRepository peopleRepository;

    @Override
    public PeopleDetailResponseDto getPeople(String code) {
        People people = peopleRepository.findByCode(code);
        if(people == null) {
            throw new IllegalArgumentException("존재 하지 않는 people 코드입니다.");
        }
        return PeopleDetailResponseMapper.INSTANCE.toDto(people);
    }
}
