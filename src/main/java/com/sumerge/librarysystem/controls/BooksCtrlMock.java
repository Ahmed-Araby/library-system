package com.sumerge.librarysystem.controls;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Profile(value = "dev")
public class BooksCtrlMock
{
    public List<String> getBooks()
    {
        List<String> books = new ArrayList<>();
        books.add("b1");
        books.add("b2");
        return books;
    }
}
