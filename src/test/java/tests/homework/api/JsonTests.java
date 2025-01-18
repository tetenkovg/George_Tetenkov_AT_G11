package tests.homework.api;

import objects.Search;
import objects.SearchResponse;

import objects.UserData;
import org.junit.Before;
import org.junit.Test;
import steps.UserSearchSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class JsonTests {

    private UserSearchSteps steps;

    @Before
    public void init() {
        steps = new UserSearchSteps();
    }

    @Test
    public void Test(){
        Search searchRequest = new Search("", false);
        SearchResponse response = steps.searchUser(searchRequest);



        System.out.println(response);

    }
    @Test
    public void strictSearchTestWithMinUserName(){
        Search searchRequest = new Search("a", true);
        SearchResponse response = steps.searchUser(searchRequest);

        assertEquals(1, response.getData().size());
        assertEquals("a", response.getData().getFirst().getUsername());
    }

    @Test
    public void notStrictSearchTestWithMinUserName(){
        Search searchRequest = new Search("a", false);
        SearchResponse response = steps.searchUser(searchRequest);


        assertTrue("Response is Empty",!response.getData().isEmpty());
        for (UserData user : response.getData()){
            assertTrue("One or Several users does not contain search criteria", user.getUsername().contains("a"));
        }
    }

}
