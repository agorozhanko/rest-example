import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class ExampleTest {

    @Test
    public void postStatusCodeTest() {
        RestAssured.given()
                .baseUri("http://petstore.swagger.io/")
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "agorozhanko")
                .body("{\n" +
                        " \"id\": 1,\n" +
                        " \"category\": {\n" +
                        " \"id\": 0,\n" +
                        " \"name\": \"string\"\n" +
                        " },\n" +
                        " \"name\": \"Lucky\",\n" +
                        " \"photoUrls\": [\n" +
                        " \"string\"\n" +
                        " ],\n" +
                        " \"tags\": [\n" +
                        " {\n" +
                        " \"id\": 0,\n" +
                        " \"name\": \"string\"\n" +
                        " }\n" +
                        " ],\n" +
                        " \"status\": \"available\"\n" +
                        "}")
                .when().post()
                .then()
                .statusCode(200);
    }

}