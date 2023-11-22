package HanilBoard.hanil.Domain.Order;

import HanilBoard.hanil.Domain.Address;
import HanilBoard.hanil.Domain.User;
import HanilBoard.hanil.Domain.board.Review;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    private Review review;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();


    @Enumerated(EnumType.STRING)
    private OrderStatus order_status;

    @Enumerated(EnumType.STRING)
    private RefundReason refund_reason;

    @Embedded
    private Address address;
    private Long total_payment;
    private Date date;
    private String recipent_name;
    private Long delivery_fee;
    private String delivery_request;
}

