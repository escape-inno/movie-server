package inno.escape.movieserver.global.model.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@SuperBuilder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseAuditingEntity implements Serializable {

  @Column(updatable = false)
  protected Timestamp createdAt;
  protected Timestamp updatedAt;
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "id", columnDefinition = "VARCHAR(36)", insertable = false, updatable = false, nullable = false)
  private String id;

  @PrePersist
  public void onPrePersist() {
    this.createdAt = Timestamp.valueOf(LocalDateTime.now());
  }

  @PreUpdate
  public void onPreUpdate() {
    this.updatedAt = Timestamp.valueOf(LocalDateTime.now());
  }
}