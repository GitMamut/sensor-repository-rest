package mintfrost.cloud.repository.sensor.outdoor.temperature;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "outdoor-temperature", path = "outdoor-temperature")
public interface OutdoorTemperatureRepository extends MongoRepository<OutdoorTemperature, String>, OutdoorTemperatureRepositoryCustom {
}
