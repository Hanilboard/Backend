package HanilBoard.hanil.Domain.product;

import lombok.Getter;

import javax.persistence.*;

@Entity@Getter
public class OptionParent {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    private String name;
}
