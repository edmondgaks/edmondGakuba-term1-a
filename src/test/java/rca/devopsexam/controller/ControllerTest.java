package rca.devopsexam.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import rca.devopsexam.devops.dtos.DoMathRequestDto;
import rca.devopsexam.devops.payload.ApiResponse;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void doMathOperation_Success(){
        DoMathRequestDto dto = new DoMathRequestDto(2, 5, "+");

        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math",dto,ApiResponse.class);

        assertEquals(200, response.getStatusCode().value());
    }
    @Test
    public void doMathOperation_Multiplication_Success() {
        DoMathRequestDto dto = new DoMathRequestDto(2, 5, "*");
        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math", dto, ApiResponse.class);
        assertEquals(200, response.getStatusCode().value());
    }
    @Test
    public void doMathOperation_Division_Success() {
        DoMathRequestDto dto = new DoMathRequestDto(10, 2, "/");
        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math", dto, ApiResponse.class);
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    public void doMathOperation_Subtraction_Success() {
        DoMathRequestDto dto = new DoMathRequestDto(8, 3, "-");
        ResponseEntity<ApiResponse> response = this.restTemplate.postForEntity("/api/v1/do_math", dto, ApiResponse.class);
        assertEquals(200, response.getStatusCode().value());
    }


}
