package steps;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import objects.Search;
import objects.SearchResponse;

public class UserSearchSteps {

    private final RequestSpecification requestSpec;

    public UserSearchSteps() {
        this.requestSpec = new RequestSpecBuilder()
                .setBaseUri("http://178.124.206.46:8001")
                .setBasePath("/app/ws/")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    public SearchResponse searchUser(Search searchBody) {
        return RestAssured
                .given()
                .spec(requestSpec)
                .body(searchBody)
                .when()
                .post()
                .then()
                .log().all()
                //.extract().body().as(Search.class)
                .extract().as(SearchResponse.class);
    }

}
