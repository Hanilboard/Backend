package HanilBoard.hanil.Repository.board;

import HanilBoard.hanil.Domain.board.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
