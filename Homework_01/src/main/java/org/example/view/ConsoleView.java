package org.example.view;

import org.example.model.Tree;

public class ConsoleView {
    public ConsoleView() {}

    public void displayAll(Tree[] trees) {
        System.out.println("All trees:");
        System.out.println("--------------------------------------------------");
        if (trees.length == 0) {
            System.out.println("The repo is empty.");
        }
        else {
            for (Tree tree : trees) {
                System.out.println(tree);
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    public void displayOlderThree(Tree[] olderTrees) {
        System.out.println("Trees older than 3 years:");

        System.out.println("--------------------------------------------------");
        if (olderTrees.length == 0) {
            System.out.println("There are no trees older than 3 years.");
        }
        else {
            for (Tree tree : olderTrees) {
                System.out.println(tree);
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println();
    }
}