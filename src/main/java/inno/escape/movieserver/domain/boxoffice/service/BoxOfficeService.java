package inno.escape.movieserver.domain.boxoffice.service;

import inno.escape.movieserver.domain.boxoffice.dto.BoxOfficeResponseDto;
import inno.escape.movieserver.domain.boxoffice.dto.BoxOfficeUpdateRequestDto;
import java.util.List;

public interface BoxOfficeService {

  List<BoxOfficeResponseDto> getBoxOffices();

  BoxOfficeResponseDto getBoxOffice(String id);

  BoxOfficeResponseDto updateBoxOffice(BoxOfficeUpdateRequestDto dto);

  void deleteBoxOffice(String id);
}
