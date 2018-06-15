package com.slicetest.repo;

import com.slicetest.model.ProductsDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by tarunkansal on 12/12/17.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class BabyProductsRepoTest {

    @Autowired
    BabyProductsRepo repo;

    @Autowired
    TestEntityManager entityManager;

    @Test
    public void test_findByCompanyName_returnList() throws Exception {
        List<BabyProductsEntity> result = this.repo.findByCompanyName("gerber");
        assertEquals("baby formula", result.get(0).getProductName());
        assertEquals("food", result.get(0).getType());
    }

    @Test
    public void test_findCompanyDetailsByCompanyName_returnList() throws Exception {
        List<BabyProductsEntity> result = this.repo.findByCompanyNameWithType("tum tum");
        assertEquals("baby formula", result.get(0).getProductName());
        assertEquals("no type", result.get(0).getType());
    }

    @Test
    public void test_findByCompanyName_returnEmptyList_whenCompanyNotFound() throws Exception {
        List<BabyProductsEntity> result = this.repo.findByCompanyName("coors");
        assertEquals(0, result.size());
    }
}
