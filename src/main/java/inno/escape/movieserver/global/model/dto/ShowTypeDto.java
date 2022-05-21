package inno.escape.movieserver.global.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class ShowTypeDto implements Serializable {

  private static final long serialVersionUID = -3550995663216297158L;

  private String showTypeGroupNm;

  private String showTypeNm;
}