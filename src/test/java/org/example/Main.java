package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class Main {

    public String URI = "https://reqres.in/";
    @Test
    public void MessageBody()
{
    RestAssured.baseURI = URI;
    String BodyAsString = RestAssured.given()
                                     .body("")
                                     .post("/api/users")
                                     .then()
                                     .statusCode(?);;


}
}
