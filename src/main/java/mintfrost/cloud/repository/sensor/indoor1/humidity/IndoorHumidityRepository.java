package mintfrost.cloud.repository.sensor.indoor1.humidity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "indoor1-humidity", path = "indoor1-humidity")
public interface IndoorHumidityRepository extends MongoRepository<IndoorHumidity, String>, IndoorHumidityRepositoryCustom {
}
