package inno.escape.movieserver.domain.people.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
public class PeopleDetailResponseDto {

    private String code;
    private String koreaName;
    private String englishName;
    private String roleName;
    private String gender;

}
