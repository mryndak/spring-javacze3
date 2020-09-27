package pl.sda.travel360.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Travel {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private BigDecimal price;

    @Column
    @Enumerated(EnumType.STRING)
    private Currency currency;

    @Column
    private LocalDate dateFrom;

    @Column
    private LocalDate dateTo;

    @Column
    private int maxMembers;

    // todo: pozostałe pola i realacje
}
