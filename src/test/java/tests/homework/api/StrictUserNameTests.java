package tests.homework.api;


import objects.Search;
import objects.SearchResponse;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import steps.UserSearchSteps;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class StrictUserNameTests {


    private UserSearchSteps steps;

    public String inputUserName;
    public String expectedUserName;


    public StrictUserNameTests(String inputUsername, String expectedUsername) {
        this.inputUserName = inputUsername;
        this.expectedUserName = expectedUsername;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"a", "a"},
                {"berta", "berta"},
                {"saldo", "saldo"},
                {"simon", "simon"},
                {"john", "john"}

        });
    }

    @Before
    public void init() {
        steps = new UserSearchSteps();

    }

    @Test
    public void testStrictTests() {
        Search searchRequest = new Search(inputUserName, true);
        SearchResponse response = steps.searchUser(searchRequest);

        assertTrue(!response.getData().isEmpty());
        assertEquals(expectedUserName, response.getData().getFirst().getUsername());


    }

}
