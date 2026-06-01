package school.hei.add.endpoint.rest.controller.arith;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.hei.add.PojaGenerated;

@PojaGenerated
@RestController
@AllArgsConstructor
public class AdditionController {

  @GetMapping("/addition")
  public ResponseEntity<String> addition(@RequestParam double a, @RequestParam double b) {
    var result = a + b;
    return new ResponseEntity<>(String.valueOf(result), HttpStatus.OK);
  }
}

