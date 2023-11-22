package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.User;
import HanilBoard.hanil.Domain.product.Product;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity@Getter
public class ProductQnA {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private Product product;

    private String content;
    private String comment;
    private Date date;
}
