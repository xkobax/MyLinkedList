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

    public E get(int position){
       Item<E> element = getElement(position);
        return element.item;
    }

    public Item<E> getElement(int position){
        int i;
        Item<E> node;
        if (position <= Math.round(size/2) ) {
            i = 1;
            node = firstItem;
            while (i < position) {
                node = node.getNextItem();
                i++;
            }
        } else {
            i = size;
            node = lastItem;
            while (i > position) {
                node = node.getPrevItem();
                i--;
            }
        }
        return node;
    }

    public void remove(int position) {
         Item<E> lost = getElement(position);

        if (position == 1) {
           firstItem = lost.nextItem;
           lost.nextItem.prevItem = null;
           size--;
        } else if (position == size) {
            lastItem = lost.prevItem;
            lost.prevItem.nextItem = null;
            size--;
        } else {
            lost.nextItem.setPrevItem(lost.prevItem);
            lost.prevItem.setNextItem(lost.nextItem);
            size--;
        }
    }

    class Item<E>{
        E  item;
        Item<E> itemE;
        Item<E> nextItem;

        Item<E> getItemE(int position) {
            return itemE;
        }

        void setItemE(Item<E> itemE) {
            this.itemE = itemE;
        }

        Item<E> prevItem;



        public Item() {
            super();
        }

        public Item(E value) {
            this.item = value;
        }


        E getItem() {
            return item;
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
