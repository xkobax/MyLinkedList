package com.ciklum.study.listtry;

public class MyList<E> {
    int size = 0;

    Item<E> lastItem;
    Item<E> firstItem;

    public void add(E value){
        Item<E> item = new Item<E>(value);
        if (size == 0) {
            firstItem = item;
            lastItem = firstItem;
        } else
            item.setPrevItem(lastItem);
        lastItem.setNextItem(item);
        lastItem = item;
        size++;
    }

    public E get(int pos){
        int i;
        Item<E> node;
        if (pos <= Math.round(size/2) ) {
            i = 0;
            node = firstItem;
            while (i < pos) {
                node = node.getNextItem();
                i++;
            }
        } else
            i = size;
            node = lastItem;
            while (i > pos) {
               node = node.getPrevItem();
                i--;
            }
        return node.getItem();
    }


    class Item<E>{
        E  item;
        Item<E> nextItem;
        Item<E> prevItem;

        E getItem() {
            return item;
        }

        Item(E item) {
            this.item = item;
        }

        public Item() {
            super();
        }

        void setItem(E item) {
            this.item = item;
        }

        Item<E> getNextItem() {
            return nextItem;
        }

        void setNextItem(Item<E> nextItem) {
            this.nextItem = nextItem;
        }

        Item<E>getPrevItem() {
            return prevItem;
        }

        void setPrevItem(Item<E> prevItem) {
            this.prevItem = prevItem;
        }
    }


}
