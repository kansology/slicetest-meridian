package com.slicetest.controller;

import com.slicetest.model.Products;
import com.slicetest.service.BabyProductsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.persistence.EntityNotFoundException;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by tarunkansal on 12/10/17.
 */
//@RunWith(SpringRunner.class)
//@WebMvcTest(BabyProductsController.class)
public class BabyProductsControllerTest {

    @MockBean
    BabyProductsService productsService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test_getProducts_returnList() throws Exception {
    }

    @Test
    public void test_getProducts_return404_whenCompanyNotFound() throws Exception {
    }


}
