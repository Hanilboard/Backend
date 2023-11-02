package HanilBoard.hanil.Domain.product;

import HanilBoard.hanil.Domain.Category;
import HanilBoard.hanil.Domain.Order.Cart;
import HanilBoard.hanil.Domain.Order.OrderItem;
import HanilBoard.hanil.Domain.board.ProductBoard;
import HanilBoard.hanil.Domain.board.Review;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity@Getter
public class Product {
    @Id @GeneratedValue
    private Long id;

    private Long price;
    private Long delivery_fee;

    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToOne(mappedBy = "product", fetch = FetchType.LAZY)
    private Cart cart;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<OptionParent> optionParents = new ArrayList<>();

    @OneToOne(mappedBy = "product", fetch = FetchType.LAZY)
    private ProductBoard productBoard;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews = new ArrayList<>();
}
