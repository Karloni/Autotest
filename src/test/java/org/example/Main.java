package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class Main {
    @Test
    public void MessageBody()
{
    RestAssured.baseURI = "https://reqres.in/";
    RequestSpecification httpRequest = RestAssured.given();
    Response response = httpRequest.get();

    ResponseBody body = response.getBody();

    String bodyAsString = body.asString();

}
}
