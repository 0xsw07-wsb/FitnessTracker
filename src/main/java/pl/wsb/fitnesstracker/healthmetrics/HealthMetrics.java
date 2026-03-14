package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
        import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "health_metrics")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class HealthMetrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userid;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "weight", nullable = false)
    private Long weight;

    @Column(name = "height", nullable = false)
    private Long height;

    @Column(nullable = false, unique = true)
    private Long healthrate;

    public HealthMetrics(
            final Long userid,
            final LocalDate date,
            final Long weight,
            final Long height,
            final Long healthrate) {

        this.userid = userid;
        this.date = date;
        this.weight = weight;
        this.height = height;
        this.healthrate = healthrate;
    }

}

