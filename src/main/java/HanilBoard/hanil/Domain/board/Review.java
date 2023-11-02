package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.Order.Order;
import HanilBoard.hanil.Domain.User;
import HanilBoard.hanil.Domain.product.Product;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity@Getter
public class Review {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private String content;
    private Date date;
}
