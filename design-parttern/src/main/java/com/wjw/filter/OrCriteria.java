package com.wjw.filter;

import java.util.List;

/**
 * @author shulu.wjw
 * @date 下午3:23 2018/6/22
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriterria;

    public OrCriteria(Criteria criteria, Criteria otherCriterria) {
        this.criteria = criteria;
        this.otherCriterria = otherCriterria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> first = criteria.meetCriteria(persons);
        List<Person> second = otherCriterria.meetCriteria(persons);
        second.forEach(person -> {
            if (!first.contains(person)) {
                first.add(person);
            }
        });

        return first;
    }
}
