package com.wjw.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shulu.wjw
 * @date 下午3:18 2018/6/22
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        persons.forEach(person -> {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                singlePersons.add(person);
            }
        });
        return singlePersons;
    }
}
