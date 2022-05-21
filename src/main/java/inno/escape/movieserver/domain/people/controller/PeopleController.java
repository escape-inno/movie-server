package inno.escape.movieserver.domain.people.controller;

import inno.escape.movieserver.domain.people.dto.PeopleDetailResponseDto;
import inno.escape.movieserver.domain.people.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping("/{code}")
    public ResponseEntity<PeopleDetailResponseDto> getPeople(@PathVariable String code) {
        PeopleDetailResponseDto peopleDetailResponseDto = peopleService.getPeople(code);
        return ResponseEntity.status(HttpStatus.OK).body(peopleDetailResponseDto);
    }
}
