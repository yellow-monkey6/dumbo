package bdcp.dumbo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bdcp.dumbo.model.Sample;
import bdcp.dumbo.repository.SampleRepository;

@SpringBootApplication
public class DumboApplication 
{
	private static final Logger logger = LoggerFactory.getLogger(DumboApplication.class);

	public static void main(String[] args) 
	{
		SpringApplication.run(DumboApplication.class);
	}

	@Bean
	public CommandLineRunner sample(SampleRepository repository)
	{
		return (args) -> 
		{
			repository.save(new Sample("dumbo"));
			repository.save(new Sample("dumbo2"));
			logger.info("Sample program.");
			List<Sample> samples = repository.findByName("dumbo");
			samples.forEach(s -> logger.info(s.toString()
			));
		};
	}
}
