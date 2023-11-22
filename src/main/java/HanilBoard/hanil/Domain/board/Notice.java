package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.User;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity@Getter
public class Notice {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

    private String title;
    private String img;
    private Long hit;
    private Date date;
    private String content;
}
