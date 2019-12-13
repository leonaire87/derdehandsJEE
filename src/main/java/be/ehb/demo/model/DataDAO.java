package be.ehb.demo.model;

import org.springframework.data.repository.CrudRepository;

public interface DataDAO extends CrudRepository<Data, Integer> {
}
