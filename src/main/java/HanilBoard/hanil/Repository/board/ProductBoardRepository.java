package HanilBoard.hanil.Repository.board;

import HanilBoard.hanil.Domain.board.ProductBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductBoardRepository extends JpaRepository<ProductBoard,Long> {
}
