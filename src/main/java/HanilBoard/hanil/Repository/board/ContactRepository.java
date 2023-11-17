package HanilBoard.hanil.Repository.board;

import HanilBoard.hanil.Domain.board.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact,Long> {
}
