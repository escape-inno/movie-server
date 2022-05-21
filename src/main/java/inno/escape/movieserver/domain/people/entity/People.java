package inno.escape.movieserver.domain.people.entity;

import inno.escape.movieserver.global.model.entity.BaseAuditingEntity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "people")
public class People extends BaseAuditingEntity {

    @Id
    @Column(name = "code", columnDefinition = "VARCHAR(36)", updatable = false, nullable = false)
    private String code;

    @Column(name = "korea_name")
    private String koreaName;

    @Column(name = "english_name")
    private String englishName;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "gender")
    private String gender;
}
