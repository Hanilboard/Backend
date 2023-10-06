package HanilBoard.hanil.Domain.Order;

import HanilBoard.hanil.Domain.User;
import HanilBoard.hanil.Domain.product.Product;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Getter@Entity
public class OrderItem {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    private String option;
    private Long qty;
    private Long total_price;
}
