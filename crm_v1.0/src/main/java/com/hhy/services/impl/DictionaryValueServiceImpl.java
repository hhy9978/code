package com.hhy.services.impl;

import com.hhy.beans.DictionaryValue;
import com.hhy.beans.DictionaryValueExample;
import com.hhy.mapper.DictionaryValueMapper;
import com.hhy.services.DictionaryValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hhy
 * @code 2023-03-01 9:31
 */
@Service
public class DictionaryValueServiceImpl implements DictionaryValueService {

    @Autowired
    private DictionaryValueMapper dictionaryValueMapper;

    @Autowired
    private DictionaryValueExample dictionaryValueExample;

    @Override
    public List<DictionaryValue> getAll() {
        dictionaryValueExample.clear();
        dictionaryValueExample.setOrderByClause("order_no ASC");
        return dictionaryValueMapper.selectByExample(dictionaryValueExample);

    }

    @Override
    public DictionaryValue getById(String id) {
        return dictionaryValueMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(String id) {
        return dictionaryValueMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer add(DictionaryValue dictionaryValue) {
        return dictionaryValueMapper.insertSelective(dictionaryValue);
    }

    @Override
    public Integer update(DictionaryValue dictionaryValue) {
        return dictionaryValueMapper.updateByPrimaryKeySelective(dictionaryValue);
    }
}
