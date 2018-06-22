package com.wjw.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shulu.wjw
 * @date 下午3:16 2018/6/22
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        persons.forEach(person -> {
            if (person.getGender().equalsIgnoreCase("female")) {
                femalePersons.add(person);
            }
        });
        return femalePersons;
    }
}
