package inno.escape.movieserver.domain.people.service;


import inno.escape.movieserver.domain.people.dto.PeopleDetailResponseDto;

public interface PeopleService {


    PeopleDetailResponseDto getPeople(String code);
}
