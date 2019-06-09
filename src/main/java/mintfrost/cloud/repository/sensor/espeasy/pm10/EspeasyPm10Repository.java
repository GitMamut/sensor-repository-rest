package mintfrost.cloud.repository.sensor.espeasy.pm10;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "espeasy-PM10", path = "espeasy-PM10")
public interface EspeasyPm10Repository extends MongoRepository<EspeasyPm10, String> {
}
