package geroba.repository;

import geroba.entity.MyEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepository extends PagingAndSortingRepository<MyEntity, String> {
}
