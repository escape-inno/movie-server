package inno.escape.movieserver.domain.boxoffice.service.impl;

import inno.escape.movieserver.domain.boxoffice.dto.BoxOfficeResponseDto;
import inno.escape.movieserver.domain.boxoffice.dto.BoxOfficeUpdateRequestDto;
import inno.escape.movieserver.domain.boxoffice.service.BoxOfficeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class BoxOfficeServiceImpl implements BoxOfficeService {

  @Override
  public List<BoxOfficeResponseDto> getBoxOffices() {
    return null;
  }

  @Override
  public BoxOfficeResponseDto getBoxOffice(String id) {
    return null;
  }

  @Override
  public BoxOfficeResponseDto updateBoxOffice(BoxOfficeUpdateRequestDto dto) {
    return null;
  }

  @Override
  public void deleteBoxOffice(String id) {

  }
}
