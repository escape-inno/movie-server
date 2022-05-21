package inno.escape.movieserver.global.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class DirectorDto implements Serializable {

  private static final long serialVersionUID = 659751890165584695L;

  private String peopleNm;

  private String peopleNmEn;
}