package mintfrost.cloud.repository.sensor.indoor2.temperature;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "indoor2-temperature", path = "indoor2-temperature")
public interface Indoor2TemperatureRepository extends MongoRepository<Indoor2Temperature, String>, Indoor2TemperatureRepositoryCustom {
}
