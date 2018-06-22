package com.wjw.filter;

import java.util.List;

/**
 * @author shulu.wjw
 * @date 下午3:21 2018/6/22
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;

    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriterria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriterria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
