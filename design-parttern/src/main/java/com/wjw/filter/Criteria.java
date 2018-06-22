package com.wjw.filter;

import java.util.List;

/**
 * @author shulu.wjw
 * @date 下午3:10 2018/6/22
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
