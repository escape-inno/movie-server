package inno.escape.movieserver.global.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class FilmoDto implements Serializable {

  private static final long serialVersionUID = -4053066014700162783L;

  private String movieCd;

  private String movieNm;

  private String companyPartNm;
}
