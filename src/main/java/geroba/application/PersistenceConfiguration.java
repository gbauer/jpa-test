package geroba.application;

import geroba.repository.MyEntityRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = MyEntityRepository.class)
@EntityScan("geroba.entity")
public class PersistenceConfiguration {
}
