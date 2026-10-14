package org.example.repository;

import org.example.model.Tree;

public interface TreeRepository {
    void add(Tree tree);
    void remove(String name);
    Tree[] getAll();
}