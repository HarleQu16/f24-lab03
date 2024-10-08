package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{

    private SortedIntList sortedIntList = new SortedIntList();

    private int totalAdded = 0;

    public int getTotalAdded() {
        return totalAdded;
    }

    @Override
    public boolean add(int num) {
        totalAdded ++;

        return sortedIntList.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean success = false;

        for (int i = 0; i < list.size(); i++)
        {
            success |= this.add(list.get(i));
        }

        return success;
    }

    @Override
    public int get(int index) {
        return sortedIntList.get(index);
    }

    @Override
    public boolean remove(int num) {
        return sortedIntList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedIntList.removeAll(list);
    }

    @Override
    public int size() {
        return sortedIntList.size();
    }
    // Write your implementation below with API documentation

}