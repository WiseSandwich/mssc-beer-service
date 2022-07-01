package guru.springframework.msscbeerservice.web.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {

    //todo impl
    return new ResponseEntity<>(BeerDto.builder().build(), OK);
  }

  @PostMapping
  public ResponseEntity savedNewBeer(@RequestBody BeerDto beerDto) {

    //todo impl
    return new ResponseEntity(CREATED);
  }

  @PutMapping("/{beerId}")
  public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {

    //todo impl
    return new ResponseEntity(NO_CONTENT);
  }

  @DeleteMapping("/{beerId}")
  public ResponseEntity deleteBeerById(@PathVariable("beerId") UUID beerId) {

    //todo impl
    return new ResponseEntity(NO_CONTENT);
  }
}
