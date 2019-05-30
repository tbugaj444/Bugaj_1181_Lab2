package com.company;

class DuplicateException extends Exception {
    DuplicateException(){
        super("There are duplicates in your Set");
    }
}
