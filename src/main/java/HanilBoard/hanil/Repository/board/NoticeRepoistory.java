package HanilBoard.hanil.Repository.board;

import HanilBoard.hanil.Domain.board.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepoistory extends JpaRepository<Notice,Long> {
}
