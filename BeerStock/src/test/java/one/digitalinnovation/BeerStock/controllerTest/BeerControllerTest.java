package one.digitalinnovation.BeerStock.controllerTest;

import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
//import jdk.internal.jshell.tool.ConsoleIOContext;
import one.digitalinnovation.BeerStock.Entity.Beer;
import one.digitalinnovation.BeerStock.Repository.BeerRepository;
import one.digitalinnovation.BeerStock.controller.BeerController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.security.RunAs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.http.RequestEntity.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
//@WebMvcTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class BeerControllerTest {

    @Autowired
    private BeerController beerController;

    @MockBean
    private BeerRepository beerRepository;
    private Long Id;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(this.beerController);
    }



        @Test
        public void buscarPorIdTest(){

            BeerRepository beerRepository = null;
            Beer beer = beerRepository.findById(1L);

            assertEquals("1", beer.getId());
            //assertEquals("boemia", String.valueOf(beer.getName()));
            //assertEquals("murilo", nutricionista.getNome());
        }


    }
