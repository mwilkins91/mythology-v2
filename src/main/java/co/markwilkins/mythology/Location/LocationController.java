package co.markwilkins.mythology.Location;

import co.markwilkins.mythology.responseHandlers.PaginatedResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LocationController {
    @RequestMapping(value="/location", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public ResponseEntity<PaginatedResponse> getAllLocations(
            @RequestParam(value="page", defaultValue="0") int page,
            @RequestParam(value="limit", defaultValue="10") int limit
            ) {

        // For a more intuitive API we will use 1 as the first page instead of 0
        final int effectivePage = page - 1;
        final int effectiveLimit = limit;

        PaginatedResponse response = new PaginatedResponse(() -> {
            List<Location> res = Location.findAllPaged(effectivePage, effectiveLimit);
            return res;
        }, effectivePage, effectiveLimit, Location.count());


        return new ResponseEntity<PaginatedResponse>(response, HttpStatus.OK);
    }
}