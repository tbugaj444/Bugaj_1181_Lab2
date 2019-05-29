package com.company;

import java.util.ArrayList;
import java.util.Collections;

class CS1181Set extends ArrayList<Integer> {
    /**
     * default constructor
     *
     * @param x
     */
    public CS1181Set(int... x) {
        for (int i : x) {
            this.add(i);
        }
    }

    /**
     * clone constructor
     *
     * @param set
     */
    public CS1181Set(CS1181Set set) {
        this.addAll(set);
    }

    /**
     * intersect function that checks if every value in THIS exists in the passed set, adds those
     * values to temp and temp is set as THIS
     *
     * @param set
     */
    public void intersect(CS1181Set set) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i : set) {
            if (this.contains(i)) {
                temp.add(i);
            }
        }

        if (!temp.isEmpty()) {
            this.clear();
            this.addAll(temp);
        }
        Collections.sort(this);

    }

    /**
     * Union function that adds any value in passed set that does not already exist in THIS
     *
     * @param set
     */
    public void union(CS1181Set set) {
        for (int i : set) {
            if (!this.contains(i)) {
                this.add(i);
            }
        }
        Collections.sort(this);

    }

    /**
     * difference function that checks both dataset's and adds every value that is not found in the other set.
     * adds those values to Temp and Temp is set as THIS
     *
     * @param set
     */
    public void difference(CS1181Set set) {
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i : set) {
            if (!this.contains(i)) {
                temp.add(i);
            }
        }
        for (int i : this) {
            if (!set.contains(i)) {
                temp.add(i);
            }
        }

        if (!temp.isEmpty()) {
            this.clear();
            this.addAll(temp);
        }
        Collections.sort(this);

    }
}