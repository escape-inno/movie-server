package inno.escape.movieserver.global.model.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class AuditDto implements Serializable {

  private static final long serialVersionUID = -2894116262379544856L;

  private String auditNo;

  private String watchGrandeNm;
}