package inno.escape.movieserver.domain.movie.controller;

import inno.escape.movieserver.domain.movie.dto.MovieDetailResponseDto;
import inno.escape.movieserver.domain.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    //     @GetMapping
//  public ResponseEntity<List<BoxOfficeResponseDto>> getBoxOffices() {
//    List<BoxOfficeResponseDto> boxOfficeResponseDtoList = boxOfficeService.getBoxOffices();
//
//    return ResponseEntity.status(HttpStatus.OK).body(boxOfficeResponseDtoList);
//  }
    @GetMapping
    public ResponseEntity<List<MovieDetailResponseDto>> getMovies() {
        List<MovieDetailResponseDto> MovieDetailResponseDtoList = movieService.getMovies();
        return ResponseEntity.status(HttpStatus.OK).body(MovieDetailResponseDtoList);
    }

    @GetMapping("/{code}")
    public ResponseEntity<MovieDetailResponseDto> getMovie(@PathVariable String code) {
        MovieDetailResponseDto movieDetailResponseDto = movieService.getMovie(code);
        return ResponseEntity.status(HttpStatus.OK).body(movieDetailResponseDto);
    }

}
