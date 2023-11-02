package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.User;
import lombok.Getter;

import javax.persistence.*;

@Entity@Getter
public class Contact {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String content;
    private String comment;
    private String company_name;
    private String part_name;
}
