package inno.escape.movieserver.global.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class GenreDto implements Serializable {

  private static final long serialVersionUID = -8848202206185624551L;

  private String genreNm;

  private String genreNmEn;
}