package HanilBoard.hanil.Domain.Order;

import HanilBoard.hanil.Domain.User;
import HanilBoard.hanil.Domain.product.Product;
import lombok.Getter;

import javax.persistence.*;

@Entity@Getter
public class Cart {

    @Id@GeneratedValue
    @Column(name = "Cart_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


    private String option;
    private Long qty;
    private Long total_price;

}
