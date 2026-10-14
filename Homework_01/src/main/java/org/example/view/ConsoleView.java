package org.example.view;

import org.example.controller.TreeController;
import org.example.model.Tree;

public class ConsoleView {
    private final TreeController controller;

    public ConsoleView(TreeController controller) {
        this.controller = controller;
    }

    public void displayAllTrees() {
        Tree[] trees = controller.getAllTrees();

        if (trees.length == 0) {
            System.out.println("The repo is empty.");
        }
        else {
            for (Tree tree : trees) {
                System.out.println(tree);
            }
        }
        System.out.println();
    }

    public void displayTreesOlderThree() {
        System.out.println("Trees older than 3 years:");

        Tree[] olderTrees = controller.getTreesOlderThree();

        if (olderTrees.length == 0) {
            System.out.println("There are no trees older than 3 years.");
        }
        else {
            for (Tree tree : olderTrees) {
                System.out.println(tree);
            }
        }
        System.out.println();
    }
}