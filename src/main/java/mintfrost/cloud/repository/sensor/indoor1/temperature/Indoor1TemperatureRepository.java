package mintfrost.cloud.repository.sensor.indoor1.temperature;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "indoor1-temperature", path = "indoor1-temperature")
public interface Indoor1TemperatureRepository extends MongoRepository<Indoor1Temperature, String>, Indoor1TemperatureRepositoryCustom {
}
