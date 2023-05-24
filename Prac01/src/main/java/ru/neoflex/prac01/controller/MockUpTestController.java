package ru.neoflex.prac01.controller;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.junit.runner.RunWith;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc //создаёт макетный http запрос, чтобы не создавать сервер
public class MockUpTestController {

    @Autowired
    private MockMvc mockMvc;

    //методы тестов
    @Test
    public void SimpleTestPlus() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/plus/1/1") )
                .andExpect(MockMvcResultMatchers.content().string("2"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void SimpleTestMinus() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/minus/120/11") )
                .andExpect(MockMvcResultMatchers.content().string("109"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void SimpleTestMinusMaxValue() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/minus/120/2147483648")) //MaxValue Int
                .andExpect(MockMvcResultMatchers.content().string(""))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void SimpleTestPlusMinValue() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/plus/-2147483648/-568") )
                .andExpect(MockMvcResultMatchers.content().string("2147483080"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void SimpleTestPlus01() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/plus/-730/880") )
                .andExpect(MockMvcResultMatchers.content().string("150"))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    public void SimpleTestMinus01() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/minus/4627/5645") )
                .andExpect(MockMvcResultMatchers.content().string("-1018"))
                .andDo(MockMvcResultHandlers.print());
    }
}
