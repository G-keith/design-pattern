package com.keith.pattern.iterator;

/**
 * @author keith
 * @version 1.0
 * @date 2020-06-18
 */
public class Name implements Container{
    private String[] names;

    public Name(String[] names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    public class NameIterator implements Iterator{
        private int index;
        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if(hasNext()){
                return names[index++];
            }else{
                return null;
            }
        }
    }
}
