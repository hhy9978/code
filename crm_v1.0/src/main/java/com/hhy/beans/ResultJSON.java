package com.hhy.beans;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author hhy
 * @code 2023-03-01 9:48
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultJSON {

    private Boolean result = true;

    private Object data;

    private String errorMsg;
}
