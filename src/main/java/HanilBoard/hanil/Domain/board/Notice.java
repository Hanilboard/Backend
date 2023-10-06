package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.User;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity@Getter
public class Notice {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String title;
    private String img;
    private Long hit;
    private Date date;
    private String content;
}
