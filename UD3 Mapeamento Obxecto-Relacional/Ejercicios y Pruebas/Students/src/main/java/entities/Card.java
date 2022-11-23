package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCards")
    private int id;

    @Column(name = "code")
    private String code;
    @Column(name = "type")
    private String type;

}
