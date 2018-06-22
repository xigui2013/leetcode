package com.wjw.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shulu.wjw
 * @date 下午3:15 2018/6/22
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersions = new ArrayList<>();
        persons.forEach(person -> {
            if (person.getGender().equalsIgnoreCase("male")) {
                malePersions.add(person);
            }
        });
        return malePersions;
    }
}
