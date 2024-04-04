package org.example.lab_12;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(doubleTheNumberController.class)
class MockTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testUsingMock() throws Exception
    {
        int number = 7;
        this.mockMvc.perform(MockMvcRequestBuilders.get("/double")
                        .param("number",String.valueOf(number)))
                .andExpect(MockMvcResultMatchers.content().string("14"));
    }



}
