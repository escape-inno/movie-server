package inno.escape.movieserver.domain.boxoffice.controller;

import inno.escape.movieserver.domain.boxoffice.dto.BoxOfficeResponseDto;
import inno.escape.movieserver.domain.boxoffice.dto.BoxOfficeUpdateRequestDto;
import inno.escape.movieserver.domain.boxoffice.service.BoxOfficeService;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/boxoffice")
public class BoxOfficeController {

  private final BoxOfficeService boxOfficeService;

  @GetMapping
  public ResponseEntity<List<BoxOfficeResponseDto>> getBoxOffices() {
    List<BoxOfficeResponseDto> boxOfficeResponseDtoList = boxOfficeService.getBoxOffices();

    return ResponseEntity.status(HttpStatus.OK).body(boxOfficeResponseDtoList);
  }

  @GetMapping("/{id}")
  public ResponseEntity<BoxOfficeResponseDto> getBoxOffice(@PathVariable String id) {
    BoxOfficeResponseDto boxOfficeResponseDto = boxOfficeService.getBoxOffice(id);

    return ResponseEntity.status(HttpStatus.OK).body(boxOfficeResponseDto);
  }

  @PutMapping
  public ResponseEntity<BoxOfficeResponseDto> updateBoxOffice(
      @RequestBody @Valid BoxOfficeUpdateRequestDto boxOfficeUpdateRequestDto) {
    BoxOfficeResponseDto boxOfficeResponseDto = boxOfficeService.updateBoxOffice(
        boxOfficeUpdateRequestDto);

    return ResponseEntity.status(HttpStatus.OK).body(boxOfficeResponseDto);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteBoxOffice(@PathVariable String id) {
    boxOfficeService.deleteBoxOffice(id);

    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }
}
