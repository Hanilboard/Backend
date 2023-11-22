package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.Order.Order;
import HanilBoard.hanil.Domain.User;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity@Getter
public class Review {
    @Id
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;
    @OneToOne(fetch = FetchType.LAZY)
    private Order order;

    private String content;
    private Date date;
}
