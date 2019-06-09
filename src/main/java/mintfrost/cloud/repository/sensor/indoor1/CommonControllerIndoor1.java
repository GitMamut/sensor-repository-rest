package mintfrost.cloud.repository.sensor.indoor1;

import mintfrost.cloud.repository.sensor.indoor1.humidity.IndoorHumidity;
import mintfrost.cloud.repository.sensor.indoor1.humidity.IndoorHumidityRepository;
import mintfrost.cloud.repository.sensor.indoor1.temperature.Indoor1Temperature;
import mintfrost.cloud.repository.sensor.indoor1.temperature.Indoor1TemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static mintfrost.cloud.repository.Application.COMMON_CONTROLLER_DEFAULT_LIMIT;
import static mintfrost.cloud.repository.Application.DATE_TIME_FORMAT_PATTERN;

@RestController
public class CommonControllerIndoor1 {
    @Autowired
    private Indoor1TemperatureRepository indoor1TemperatureRepository;
    @Autowired
    private IndoorHumidityRepository indoor1HumidityRepository;

    @RequestMapping("/indoor1-temperature/findByTime")
    public List<Indoor1Temperature> indoor1Temperature(
            @RequestParam(value = "limit", defaultValue = COMMON_CONTROLLER_DEFAULT_LIMIT) String limit,
            @RequestParam(value = "fromDate", required = false) @DateTimeFormat(pattern = DATE_TIME_FORMAT_PATTERN) Date fromDate
    ) {
        return indoor1TemperatureRepository.findAfterDate(fromDate, Integer.valueOf(limit));
    }

    @RequestMapping("/indoor1-humidity/findByTime")
    public List<IndoorHumidity> indoorHumidity(
            @RequestParam(value = "limit", defaultValue = COMMON_CONTROLLER_DEFAULT_LIMIT) String limit,
            @RequestParam(value = "fromDate", required = false) @DateTimeFormat(pattern = DATE_TIME_FORMAT_PATTERN) Date fromDate
    ) {
        return indoor1HumidityRepository.findAfterDate(fromDate, Integer.valueOf(limit));
    }
}
