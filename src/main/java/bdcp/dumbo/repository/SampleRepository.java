package bdcp.dumbo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import bdcp.dumbo.model.Sample;

public interface SampleRepository extends CrudRepository<Sample, Integer> 
{
    List<Sample> findByName(String name);
}
