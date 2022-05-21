package inno.escape.movieserver.domain.movie.entity;

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
@Entity(name = "movie")
public class Movie extends BaseAuditingEntity {

    @Id
    @Column(name = "code", columnDefinition = "VARCHAR(36)", updatable = false, nullable = false)
    private String code;

    @Column(name = "korea_title")
    private String koreaTitle;

    @Column(name = "english_title")
    private String englishTitle;

    @Column(name = "nation")
    private String nation;

    @Column(name = "year")
    private int year;

    @Column(name = "age_limit")
    private String ageLimit; //
}
