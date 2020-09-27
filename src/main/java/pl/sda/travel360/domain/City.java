package pl.sda.travel360.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    // todo: pozostałe pola i realacje
}
