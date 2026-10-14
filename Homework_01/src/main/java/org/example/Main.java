package org.example;

import org.example.controller.TreeController;
import org.example.model.Apple;
import org.example.model.Cherry;
import org.example.model.Pear;
import org.example.repository.MemoryRepository;
import org.example.repository.TreeRepository;
import org.example.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        TreeRepository repository = new MemoryRepository(5);
        TreeController controller = new TreeController(repository);
        ConsoleView view = new ConsoleView(controller);

        System.out.println("Placing trees into the repo.");

        controller.addTree(new Apple("appleTree01", 2));
        controller.addTree(new Pear("pearTree01", 5));
        controller.addTree(new Cherry("cherryTree01", 4));
        controller.addTree(new Apple("appleTree02", 1));
        controller.addTree(new Cherry("cherryTree02", 6));

        System.out.println("Done.");
        System.out.println();

        // System.out.println("DB_01:");
        // view.displayAllTrees();

        view.displayTreesOlderThree();

        /*
        System.out.println("Test_01:  Removing 'pearTree01' from the repo.");
        controller.removeTree("pearTree01");
        System.out.println("Done.");
        System.out.println();
         */

        // System.out.println("DB_02:");
        // view.displayAllTrees();
    }
}