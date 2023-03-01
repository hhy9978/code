package com.hhy.test;

import com.hhy.services.DictionaryTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author hhy
 * @code 2023-03-01 10:09
 */
@SpringJUnitConfig(locations = "classpath:application.xml")
public class DictionaryTypeServiceTest {

    @Autowired
    private DictionaryTypeService dictionaryTypeService;

    @Test
    public void testGetAll() {
        dictionaryTypeService.getAll().forEach(System.out::println);
    }
}
