package one.digitalinnovation.BeerStock.controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import one.digitalinnovation.BeerStock.Entity.Beer;
import one.digitalinnovation.BeerStock.Repository.BeerRepository;
import one.digitalinnovation.BeerStock.exception.BeerAlreadyRegisteredException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/beer")
@AllArgsConstructor
//@NoArgsConstructor
public class BeerController {

    @Autowired
    private BeerRepository beerRepository;

        @GetMapping
        public List<Beer> listBeer(){
            return beerRepository.findAll();
        }/*
        @GetMapping("/beer/{id}")
        public Beer listBeerId(@PathVariable(value="id") long id){
            return beerRepository.findById(id);
        }*/


        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        //@RequestMapping(value = "/beer/createBeer", method = RequestMethod.POST)
        public Beer createBeer(@RequestBody Beer beer) throws BeerAlreadyRegisteredException {
            return beerRepository.save(beer);
    }


}
