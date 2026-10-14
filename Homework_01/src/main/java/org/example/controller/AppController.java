package org.example.controller;

import org.example.model.Tree;
import org.example.repository.TreeRepository;

public class AppController {
    private final TreeRepository repository;

    public AppController(TreeRepository repository) {
        this.repository = repository;
    }

    public void addTree(Tree tree) {
        repository.add(tree);
    }

    public void removeTree(String name) {
        repository.remove(name);
    }

    public Tree[] getAllTrees() {
        return repository.getAll();
    }

    public Tree[] getTreesOlderThree() {
        Tree[] allTrees = repository.getAll();

        int numTrees = 0;
        for (Tree tree : allTrees) {
            if (tree.getAge() >= 3) {
                numTrees++;
            }
        }

        Tree[] result = new Tree[numTrees];
        int idx = 0;
        for (Tree tree : allTrees) {
            if (tree.getAge() >= 3) {
                result[idx++] = tree;
            }
        }
        return result;
    }
}