package org.example.repository;

import org.example.model.Tree;

public class MemoryRepository implements TreeRepository {
    private final Tree[] elements;
    private int size;

    public MemoryRepository(int capacity) {
        this.elements = new Tree[capacity];
        this.size = 0;
    }

    @Override
    public void add(Tree tree) {
        elements[size++] = tree;
    }

    @Override
    public void remove(String name) {
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].getSpeciesName().equalsIgnoreCase(name)) {
                indexToRemove = i;
                break;
            }
        }

        for (int i = indexToRemove; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    @Override
    public Tree[] getAll() {
        Tree[] allTrees = new Tree[size];
        System.arraycopy(elements, 0, allTrees, 0, size);
        return allTrees;
    }
}