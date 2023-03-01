package com.hhy.test;

import com.hhy.beans.DictionaryType;
import com.hhy.beans.ResultJSON;
import com.hhy.controller.DictionaryTypeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @author hhy
 * @code 2023-03-01 10:01
 */
@SpringJUnitConfig(locations = "classpath:application.xml")
public class DictionaryTypeControllerTest {

    @Autowired
    private DictionaryTypeController dictionaryTypeController;

    @Test
    public void testGetAll() throws Exception {
        ResultJSON resultJSON = dictionaryTypeController.getAll();
        List<DictionaryType> data = (List<DictionaryType>) resultJSON.getData();
        data.forEach(System.out::println);
    }
}
