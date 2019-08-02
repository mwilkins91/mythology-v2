package co.markwilkins.mythology.HealthCheck;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthCheckController {
    @RequestMapping(value="/healthcheck", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public ResponseEntity<HealthCheck> healthCheck(@RequestParam(value="name", defaultValue="World") String name) {
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        HealthCheck res = new HealthCheck();

        return new ResponseEntity<HealthCheck>(res, httpHeaders, HttpStatus.OK);
    }
}