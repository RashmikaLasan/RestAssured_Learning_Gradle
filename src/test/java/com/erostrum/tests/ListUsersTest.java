package com.erostrum.tests;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class ListUsersTest {



    @Test
    public void testUsersStatusCode(){

        //given,when,then

        String url="https://reqres.in/api/users?page=2";
        given().contentType(ContentType.JSON).when().get(url).then().statusCode(200);
       }

       @Test
    public void testUserResponse(){
           String url="https://reqres.in/api/users?page=2";
           given().contentType(ContentType.JSON).when().get(url).
                   then().extract().response().prettyPrint();

        }





}
