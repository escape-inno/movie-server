package inno.escape.movieserver.domain.boxoffice.entity;

import inno.escape.movieserver.global.model.entity.BaseAuditingEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity(name = "box_office")
public class BoxOffice extends BaseAuditingEntity {

  private static final long serialVersionUID = -4354015219029516786L;

//  @OneToOne
//  @JoinColumn(name = "movie_id")
//  private Movie movie;

  @Column(name = "ranking")
  private int ranking;

  @Column(name = "ranked_date")
  private String rankedDate;
}