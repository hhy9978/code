package com.hhy.services.impl;

import com.hhy.beans.DictionaryType;
import com.hhy.mapper.DictionaryTypeMapper;
import com.hhy.services.DictionaryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author hhy
 * @code 2023-03-01 9:32
 */
@Service
public class DictionaryTypeServiceImpl implements DictionaryTypeService {

    @Autowired
    private DictionaryTypeMapper dictionaryTypeMapper;


    @Override
    public List<DictionaryType> getAll() {
        return dictionaryTypeMapper.selectByExample(null);
    }

    @Override
    public DictionaryType getById(String id) {
        return dictionaryTypeMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer deleteById(String id) {
        return dictionaryTypeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer add(DictionaryType dictionaryType) {
        return dictionaryTypeMapper.insertSelective(dictionaryType);
    }

    @Override
    public Integer update(DictionaryType dictionaryType) {
        return dictionaryTypeMapper.updateByPrimaryKeySelective(dictionaryType);
    }
}
