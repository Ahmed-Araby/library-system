package com.sumerge.librarysystem.boundries;

import com.sumerge.librarysystem.controls.BooksCtrlMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksResource
{
    @Autowired(required = false)
    private BooksCtrlMock booksCtrlMock;

    @Value("${server.port}")
    private String port;
    @Value("${host.name}")
    private String host;

    @GetMapping("props")
    public List<String> getProps()
    {
        List<String> props = new ArrayList<>();
        props.add(port);
        props.add(host);
        return props;
    }

    @GetMapping
    public List<String> getBooks()
    {
        List<String> books = booksCtrlMock.getBooks();
        return books;
    }
}
