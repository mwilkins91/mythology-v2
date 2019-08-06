package co.markwilkins.mythology.Location;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {
    @RequestMapping(value="/location", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public ResponseEntity<List<Location>> healthCheck(@RequestParam(value="name", defaultValue="World") String name) {
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        List<Location> res = Location.findAll();

        return new ResponseEntity<List<Location>>(res, httpHeaders, HttpStatus.OK);
    }
}