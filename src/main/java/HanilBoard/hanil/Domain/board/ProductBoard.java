package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.product.Product;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity@Getter
public class ProductBoard {
    @Id @GeneratedValue
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private String title;
    private Long price;
    private String content;
    private Tag tag;    // enum 만들어야함
    private Date date;
}
