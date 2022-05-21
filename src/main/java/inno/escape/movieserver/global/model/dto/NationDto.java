package inno.escape.movieserver.global.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class NationDto implements Serializable {

  private static final long serialVersionUID = -4061994493958405357L;

  private String nationNm;

  private String nationNmEn;
}