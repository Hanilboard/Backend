package HanilBoard.hanil.Domain.Order;

import HanilBoard.hanil.Domain.Address;
import HanilBoard.hanil.Domain.User;
import HanilBoard.hanil.Domain.board.Review;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity@Getter
public class Order {
    @Id
    private Long id;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    private Review review;

    @OneToMany
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

