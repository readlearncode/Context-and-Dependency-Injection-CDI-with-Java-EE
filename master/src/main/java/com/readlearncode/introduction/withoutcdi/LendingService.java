package com.readlearncode.introduction.withoutcdi;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class LendingService {

    public void lendBook(Book book){
        System.out.println(book.getTitle() + " has been lent");
    }

}