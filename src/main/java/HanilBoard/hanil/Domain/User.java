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

@Entity @Getter
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

    @OneToMany
    private List<Order> orders = new ArrayList<>();

    @OneToMany
    private List<Cart> carts = new ArrayList<>();

    @OneToMany
    private List<Review> reviews = new ArrayList<>();

    @OneToMany
    private List<Notice> notices = new ArrayList<>();

    @OneToMany
    private List<Contact> contacts = new ArrayList<>();

    @OneToMany
    private List<ProductQnA> productQnAs = new ArrayList<>();

}
