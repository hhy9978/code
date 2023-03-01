package com.hhy.controller;

import com.hhy.beans.DictionaryValue;
import com.hhy.beans.ResultJSON;
import com.hhy.services.DictionaryValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.UUID;

/**
 * @author hhy
 * @code 2023-03-01 9:45
 */
@RestController
@RequestMapping("/dictionaryValue")
public class DictionaryValueController {

    @Autowired
    private DictionaryValueService dictionaryValueService;

    @RequestMapping("getAll.action")
    public ResultJSON getAll() {
        List<DictionaryValue> dictionaryValueList = dictionaryValueService.getAll();
        ResultJSON resultJSON = new ResultJSON();
        resultJSON.setData(dictionaryValueList);
        return resultJSON;
    }

    @RequestMapping("get.action")
    public ResultJSON edit(String id) {
        DictionaryValue dictionaryValue = dictionaryValueService.getById(id);
        ResultJSON resultJSON = new ResultJSON();
        resultJSON.setData(dictionaryValue);
        return resultJSON;
    }

    @RequestMapping("del.action")
    public ResultJSON del(String id) {
        ResultJSON resultJSON = new ResultJSON();
        dictionaryValueService.deleteById(id);
        return resultJSON;
    }


    @RequestMapping("edit.action")
    public ResultJSON edit(DictionaryValue dictionaryValue) {
        Integer rows = dictionaryValueService.update(dictionaryValue);
        ResultJSON resultJSON = new ResultJSON();
        return resultJSON;
    }

    @RequestMapping("add.action")
    public ResultJSON add(DictionaryValue dictionaryValue) {
        dictionaryValue.setId(UUID.randomUUID().toString());
        Integer rows = dictionaryValueService.add(dictionaryValue);
        ResultJSON resultJSON = new ResultJSON();
        return resultJSON;
    }
    

    
}
