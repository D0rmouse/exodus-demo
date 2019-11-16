package exodus.demo.integration.repositories.some.repo;


import exodus.demo.commons.core.SomeCommonUtil;
import exodus.demo.core.repositories.some.repo.SomeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SomeRepositoryImpl implements SomeRepository {

    public String doSomething() {
        return SomeCommonUtil.fabricateSomeString();
    }
}