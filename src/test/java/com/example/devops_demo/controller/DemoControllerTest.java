package com.example.devops_demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test class for DemoController
 * This test verifies that the /hello endpoint returns the expected message
 */
@WebMvcTest(DemoController.class)
public class DemoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test that the /hello endpoint returns status 200 OK
     * and the correct message
     */
    @Test
    public void testHelloEndpoint() throws Exception {
        // Perform GET request to /hello
        mockMvc.perform(get("/hello"))
                // Verify response status is 200 OK
                .andExpect(status().isOk())
                // Verify response body matches expected text
                .andExpect(content().string("DevOps demo - CI/CD is working!!"));
    }
}