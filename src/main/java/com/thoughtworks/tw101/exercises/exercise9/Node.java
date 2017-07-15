package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;
import java.util.ArrayList;

public class Node {
    private String name;
    private Node right;
    private Node left;

    public Node(String name) {
        this.name = name;
        right = null;
        left = null;
    }

    public void add(String nameOfNewNode) {
        int comparison = nameOfNewNode.compareToIgnoreCase(name);
        if (comparison < 0) {
            if (left==null) {
                left = new Node(nameOfNewNode);
            }
            else {
                left.add(nameOfNewNode);
            }
        }
        else if (comparison > 0) {
            if (right==null) {
                right = new Node(nameOfNewNode);
            }
            else {
                right.add(nameOfNewNode);
            }
        }
        else {
            // comparison == 0
            // same String value
            // do nothing
        }
    }

    public List<String> names() {
        ArrayList<String> nameList = new ArrayList<String>();
        if (left!=null) {
            nameList.addAll(left.names());
        }
        nameList.add(name);
        if (right!=null) {
            nameList.addAll(right.names());
        }
        return nameList;
    }
}
