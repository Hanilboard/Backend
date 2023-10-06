package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.product.Product;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity@Getter
public class ProductBoard {
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Product product;

    private String title;
    private Long price;
    private String content;
    private Tag tag;    // enum 만들어야함
    private Date date;
}
