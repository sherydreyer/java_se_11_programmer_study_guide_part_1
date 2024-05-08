package chapter8.inheritingmembers;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Reptile {
    protected void sleepInShell() throws IOException {
    }

    protected void hideInShell() throws NumberFormatException {
    }

    protected void exitShell() throws FileNotFoundException {
    }
}

class GalapagosTortoise extends Reptile {
    public void sleepInShell() throws FileNotFoundException {
    }  //public is more accessible than protective so it is fine

    //FileNotFoundException is A SUBCLASS OF IOException , so it is fine too
    public void hideInShell() throws IllegalArgumentException {
    } //NumberFormatException  and IllegalArgumentException ar eboth unchecked so it is fine
    //   public void exitShell() throws IOException {} // DOES NOT COMPILE  exception must not be broader than parents exceptionCOMPILE
}