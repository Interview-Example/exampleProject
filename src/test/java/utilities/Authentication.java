package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication {
    public static void main(String[] args) {
        String guncelToken = generateToken("admin");
        System.out.println(guncelToken);
    }

    public static String generateToken(String username){

        RequestSpecification spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        //Set the base url
        //api/authenticate
        spec.pathParams("first", "api", "second", "authenticate");

        //Set the expected data

        Map<String, Object> expectedData = new HashMap<>();
        expectedData.put("username", ConfigReader.getProperty(username));
        expectedData.put("password", "Team63.");
        expectedData.put("rememberMe",true );

        //Send the Post request and get the data
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expectedData).when().post("/{first}/{second}");

        response.prettyPrint();
        JsonPath json = response.jsonPath();

        return json.getString("id_token");

    }


}
