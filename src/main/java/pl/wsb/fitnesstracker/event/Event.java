package pl.wsb.fitnesstracker.event;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Table(name = "event")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nullable
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "startTime", nullable = false)
    private LocalDate startTime;

    @Column(name = "endTime")
    private LocalDate endTime;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    public Event(final String name, final LocalDate startTime, final String city) {
        this.name = name;
        this.startTime = startTime;
        this.city = city;
    }
}
