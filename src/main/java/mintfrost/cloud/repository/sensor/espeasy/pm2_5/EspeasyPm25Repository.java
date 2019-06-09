package mintfrost.cloud.repository.sensor.espeasy.pm2_5;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "espeasy-PM2_5", path = "espeasy-PM2_5")
public interface EspeasyPm25Repository extends MongoRepository<EspeasyPm25, String> {
}
