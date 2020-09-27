package pl.sda.travel360.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;

    // todo: pozostałe pola i realacje
}
