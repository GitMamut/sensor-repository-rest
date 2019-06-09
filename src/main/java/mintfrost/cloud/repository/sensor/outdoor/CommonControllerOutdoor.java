package mintfrost.cloud.repository.sensor.outdoor;

import mintfrost.cloud.repository.sensor.outdoor.temperature.OutdoorTemperature;
import mintfrost.cloud.repository.sensor.outdoor.temperature.OutdoorTemperatureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static mintfrost.cloud.repository.Application.COMMON_CONTROLLER_DEFAULT_LIMIT;
import static mintfrost.cloud.repository.Application.DATE_TIME_FORMAT_PATTERN;

@RestController
public class CommonControllerOutdoor {
    @Autowired
    private OutdoorTemperatureRepository outdoorTemperatureRepository;

    @CrossOrigin
    @RequestMapping("/outdoor-temperature/findByTime")
    public List<OutdoorTemperature> outdoorTemperature(
            @RequestParam(value = "limit", defaultValue = COMMON_CONTROLLER_DEFAULT_LIMIT) String limit,
            @RequestParam(value = "fromDate", required = false) @DateTimeFormat(pattern = DATE_TIME_FORMAT_PATTERN) Date fromDate
    ) {
        return outdoorTemperatureRepository.findAfterDate(fromDate, Integer.valueOf(limit));
    }
}
