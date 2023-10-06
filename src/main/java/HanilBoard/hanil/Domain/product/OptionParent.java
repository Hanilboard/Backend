package HanilBoard.hanil.Domain.product;

import lombok.Getter;

import javax.persistence.*;

@Entity@Getter
public class OptionParent {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    private String name;
}
