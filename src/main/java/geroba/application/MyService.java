package geroba.application;

import geroba.entity.MyEntity;
import geroba.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Autowired
    private MyEntityRepository myEntityRepository;

    public void doTest() {
        myEntityRepository.save(new MyEntity());
    }
}
