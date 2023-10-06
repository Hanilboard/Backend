package HanilBoard.hanil.Domain.board;

import HanilBoard.hanil.Domain.User;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity@Getter
public class Contact {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private String content;
    private String comment;
    private String company_name;
    private String part_name;
}
