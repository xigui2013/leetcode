package com.wjw.iterator;

/**
 * @author shulu.wjw
 * @date 上午1:34 2018/6/23
 */
public class NameRepository implements Container {

    public String[] names = {"Robert", "John", "Julie", "Lora"};

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
