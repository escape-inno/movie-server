package inno.escape.movieserver.domain.movie.service.impl;

import inno.escape.movieserver.domain.movie.dto.MovieDetailResponseDto;
import inno.escape.movieserver.domain.movie.entity.Movie;
import inno.escape.movieserver.domain.movie.entity.MovieCompany;
import inno.escape.movieserver.domain.movie.entity.MovieGenre;
import inno.escape.movieserver.domain.movie.entity.MoviePeople;
import inno.escape.movieserver.domain.movie.mapper.GenreResponseMapper;
import inno.escape.movieserver.domain.movie.mapper.MovieDetailResponseMapper;
import inno.escape.movieserver.domain.movie.repository.MovieCompanyRepository;
import inno.escape.movieserver.domain.movie.repository.MovieGenreRepository;
import inno.escape.movieserver.domain.movie.repository.MoviePeopleRepository;
import inno.escape.movieserver.domain.movie.repository.MovieRepository;
import inno.escape.movieserver.domain.movie.service.MovieService;
import inno.escape.movieserver.domain.people.dto.PeopleDetailResponseDto;
import inno.escape.movieserver.domain.people.entity.People;
import inno.escape.movieserver.domain.people.mapper.PeopleDetailResponseMapper;
import inno.escape.movieserver.domain.people.repository.PeopleRepository;
import inno.escape.movieserver.global.model.dto.GenreDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final PeopleRepository peopleRepository;
//    private final CompanyRepository companyRepository;
    private final MovieGenreRepository movieGenreRepository;
    private final MoviePeopleRepository moviePeopleRepository;
    private final MovieCompanyRepository movieCompanyRepository;

    @Override
    public List<MovieDetailResponseDto> getMovies() {

        return null;
    }

    @Override
    public MovieDetailResponseDto getMovie(String code) {
        Movie movie = movieRepository.findByCode(code);
        if(movie == null) {
            throw new IllegalArgumentException("???????????? ?????? ?????? ???????????????.");
        }
        MovieDetailResponseDto movieDetailResponseDto = MovieDetailResponseMapper.INSTANCE.toDto(movie);
        List<MovieCompany> movieCompanyList = movieCompanyRepository.findByMovie(movie);
//        List<MovieCompany> companyList = new ArrayList<>();
//        for(MovieCompany movieCompany : companyList) {
//            companyList.add(movieCompany.getCompany());
//        }
//        movieDetailResponseDto.setCompanies(CompanyDetailResponseMapper.INSTANCE.toDtoList(companyList));
//
        List<MoviePeople> moviePeopleList = moviePeopleRepository.findByMovie(movie);
        List<People> peopleList = new ArrayList<>();
        for(MoviePeople moviePeople : moviePeopleList) {
            peopleList.add(moviePeople.getPeople());
        }
        movieDetailResponseDto.setPeoples(PeopleDetailResponseMapper.INSTANCE.toDtoList(peopleList));

        List<MovieGenre> movieGenreList = movieGenreRepository.findByMovie(movie);
        movieDetailResponseDto.setGenreList(GenreResponseMapper.INSTANCE.toDtoList(movieGenreList));

        return movieDetailResponseDto;
    }

    @Override
    public List<MovieDetailResponseDto> getFilmoByPeople(String peopleCode) {
        People people = peopleRepository.findByCode(peopleCode);
        if(people == null){
            throw new IllegalArgumentException("?????? ?????? ?????? people ???????????????.");
        }

        List<MoviePeople> moviePeopleList = moviePeopleRepository.findByPeople(people);
        List<Movie> movieList = new ArrayList<>();
        for(MoviePeople moviePeople : moviePeopleList) {
            movieList.add(moviePeople.getMovie());
        }

        return MovieDetailResponseMapper.INSTANCE.toDtoList(movieList);
    }

//    @Override
//    public List<MovieDetailResponseDto> getFilmoByCompany(String companyCode) {
//        Company company = companyRepository.findByCode(companyCode);
//        if(company == null){
//            throw new IllegalArgumentException("?????? ?????? ?????? company ???????????????.");
//        }
//
//        List<MovieCompany> movieCompanyList = moviePeopleRepository.findByCompany(company);
//        List<Movie> movieList = new ArrayList<>();
//        for(MovieCompany movieCompany : movieCompanyList) {
//            movieList.add(movieCompany.getMovie());
//        }
//
//        return MovieDetailResponseMapper.INSTANCE.toDtoList(movieList);
//    }
}
