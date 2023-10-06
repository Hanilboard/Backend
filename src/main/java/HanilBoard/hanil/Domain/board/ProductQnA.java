package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.User;
import HanilBoard.hanil.Domain.product.Product;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity@Getter
public class ProductQnA {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    private String content;
    private String comment;
    private Date date;
}
