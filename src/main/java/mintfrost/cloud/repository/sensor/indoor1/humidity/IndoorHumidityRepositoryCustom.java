package mintfrost.cloud.repository.sensor.indoor1.humidity;

import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface IndoorHumidityRepositoryCustom {
    List<IndoorHumidity> findAfterDate(@Param("date") Date fromDate, Integer limit);
}
