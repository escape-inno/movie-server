package inno.escape.movieserver.global.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class StaffDto implements Serializable {

  private static final long serialVersionUID = 7111697258327868403L;

  private String peopleNm;

  private String peopleNmEn;

  private String staffRoleNm;
}