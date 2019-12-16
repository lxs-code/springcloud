package com.zking.eurekaprovider.Controller;

import com.zking.eurekaprovider.model.book;
import com.zking.eurekaprovider.uitl.JsonData;
import com.zking.vo.model.BookVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class BookController {


@RequestMapping("/book")
    public JsonData  Book(@RequestBody book book){
        JsonData jsonData=new JsonData();
        jsonData.setResult(book);
    System.out.println("你访问了book,name="+ book.getName()+"id="+book.getId());
        return  jsonData;
    }



    @RequestMapping("/bookVo")
    public JsonData  bookVo(@RequestBody BookVo book){
        JsonData jsonData=new JsonData();
        jsonData.setResult(book);
        System.out.println("你访问了bookVo,name="+ book.getName()+"id="+book.getId());
        return  jsonData;
    }
}
