package mz.co.insurance.mk.repository;

import java.util.List;
import mz.co.insurance.mk.model.TodoItem;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoItemRepository
  extends PagingAndSortingRepository<TodoItem, Long> {
  List<TodoItem> findByListId(Long listId);

  List<TodoItem> findByListId(Long listId, Pageable pageable);

  List<TodoItem> findByListIdAndState(
    Long listId,
    String state,
    Pageable pageable
  );
}
