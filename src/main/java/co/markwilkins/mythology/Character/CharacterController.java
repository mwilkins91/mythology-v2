package co.markwilkins.mythology.Character;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CharacterController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/character", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public ResponseEntity<Character> healthCheck(@RequestParam(value="name", defaultValue="World") String name) {
        final HttpHeaders httpHeaders= new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        Character res = new Character();
        return new ResponseEntity<Character>(res, httpHeaders, HttpStatus.OK);
    }
}