package com.hhy.controller;

import com.hhy.beans.DictionaryType;
import com.hhy.beans.ResultJSON;
import com.hhy.services.DictionaryTypeService;
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
@RequestMapping("/dictionaryType")
public class DictionaryTypeController {

    @Autowired
    private DictionaryTypeService dictionaryTypeService;

    @RequestMapping("getAll.action")
    public ResultJSON getAll() {
        List<DictionaryType> dictionaryTypeList = dictionaryTypeService.getAll();
        ResultJSON resultJSON = new ResultJSON();
        resultJSON.setData(dictionaryTypeList);
        return resultJSON;
    }

    @RequestMapping("get.action")
    public ResultJSON edit(String id) {
        DictionaryType dictionaryType = dictionaryTypeService.getById(id);
        ResultJSON resultJSON = new ResultJSON();
        resultJSON.setData(dictionaryType);
        return resultJSON;
    }

    @RequestMapping("del.action")
    public ResultJSON del(String id) {
        ResultJSON resultJSON = new ResultJSON();
        dictionaryTypeService.deleteById(id);
        return resultJSON;
    }


    @RequestMapping("edit.action")
    public ResultJSON edit(DictionaryType dictionaryType) {
        Integer rows = dictionaryTypeService.update(dictionaryType);
        ResultJSON resultJSON = new ResultJSON();
        return resultJSON;
    }

    @RequestMapping("add.action")
    public ResultJSON add(DictionaryType dictionaryType) {
        dictionaryType.setId(UUID.randomUUID().toString());
        Integer rows = dictionaryTypeService.add(dictionaryType);
        ResultJSON resultJSON = new ResultJSON();
        return resultJSON;
    }

}
