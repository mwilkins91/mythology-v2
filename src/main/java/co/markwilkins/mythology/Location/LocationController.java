package co.markwilkins.mythology.Location;

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
    public ResponseEntity<Map> getAllLocations(
            @RequestParam(value="page", defaultValue="0") int page,
            @RequestParam(value="limit", defaultValue="10") int limit
            ) {
        page = page - 1;
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        List<Location> res = Location.findAllPaged(page, limit);

        Map<String, Object> metaData = new HashMap();
        int lastPage = (int) Math.ceil(( (double) Location.count()) / limit);
        Integer nextPage = (page + 2) > lastPage ? null : page + 2;
        metaData.put("current_page", page + 1);
        metaData.put("next_page", nextPage);
        metaData.put("total_pages",  lastPage);

        Map<String, Object> response = new HashMap();
        response.put("payload", res);
        response.put("meta", metaData);


        return new ResponseEntity<Map>(response, httpHeaders, HttpStatus.OK);
    }
}