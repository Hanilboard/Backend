package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.User;
import HanilBoard.hanil.Domain.product.Product;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity@Getter
public class ProductQnA {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private String content;
    private String comment;
    private Date date;
}
