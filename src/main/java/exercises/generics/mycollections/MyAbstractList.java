package exercises.generics.mycollections;

public abstract class MyAbstractList<T> extends MyAbstractCollection implements MyList<T> {
    static class MyListIterator<T> implements MyIterator<T> {
        MyList<T> list;
        int position;

        public MyListIterator(MyList<T> list) {
            this.list = list;
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < list.size();
        }

        @Override
        public T next() {
            return list.get(position++);
        }
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyListIterator(this);
    }
}
