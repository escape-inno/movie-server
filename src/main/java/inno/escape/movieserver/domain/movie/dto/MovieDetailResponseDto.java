package inno.escape.movieserver.domain.movie.dto;

import inno.escape.movieserver.domain.people.dto.PeopleDetailResponseDto;
import inno.escape.movieserver.global.model.dto.GenreDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class MovieDetailResponseDto {

    private String movieCode;
    private String koreaTitle;
    private String englishTitle;
    private String nation;
    private String year;
    private List<GenreDto> genreList;
    private List<PeopleDetailResponseDto> peoples; // director, actor
    private List<CompanyDetailResponseDto> companies;

}
