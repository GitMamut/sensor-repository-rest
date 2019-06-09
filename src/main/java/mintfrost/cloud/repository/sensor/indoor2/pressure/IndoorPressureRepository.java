package mintfrost.cloud.repository.sensor.indoor2.pressure;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "indoor2-pressure", path = "indoor2-pressure")
public interface IndoorPressureRepository extends MongoRepository<IndoorPressure, String>, IndoorPressureRepositoryCustom {
}
