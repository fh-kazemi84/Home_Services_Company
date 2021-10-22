package com.kazemi.home_services_company.model.homeservices;

import com.kazemi.home_services_company.enums.OrderSituation;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @author fh.kazemi
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Table(name = "order_history")
public class OrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "order_situation")
    private OrderSituation orderSituation;

    @Temporal(value = TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "change_date")
    private Date changeDate;

    @ManyToOne
    private Orders order;
}
