package arabianLogistics.ArabianLogistics.data.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "_reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private int rating;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "rider_id")
    private Rider rider;
}
