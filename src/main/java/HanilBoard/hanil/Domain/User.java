package HanilBoard.hanil.Domain;

import HanilBoard.hanil.Domain.Order.Cart;
import HanilBoard.hanil.Domain.Order.Order;
import HanilBoard.hanil.Domain.board.Contact;
import HanilBoard.hanil.Domain.board.Notice;
import HanilBoard.hanil.Domain.board.ProductQnA;
import HanilBoard.hanil.Domain.board.Review;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String pwd;
    private String email;

    @Embedded
    private Address address;

    private String authcode;
    private String phone;

    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Cart> carts = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Notice> notices = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Contact> contacts = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<ProductQnA> productQnAs = new ArrayList<>();

}
