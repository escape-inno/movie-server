package inno.escape.movieserver.domain.boxoffice.dto;

import inno.escape.movieserver.global.model.dto.BaseAuditingDto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class BoxOfficeResponseDto extends BaseAuditingDto {

  private String movieId;

  private int ranking;

  private String rankedDate;
}
