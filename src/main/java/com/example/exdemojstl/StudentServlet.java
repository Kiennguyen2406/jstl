package com.example.exdemojstl;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "studentServlet", value = "/student-servlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Student> list = new ArrayList<>();


        list.add(new Student("a", "12-12-12", "hn", "https://th.bing.com/th/id/R.d4ac6b0d44e20bf6e9b8a61ccc09f8fc?rik=k%2fpXBCUfkq%2fgeA&pid=ImgRaw&r=0"));
        list.add(new Student("b", "13-13-13", "dn", "https://wall.vn/wp-content/uploads/2020/04/anh-dep-viet-nam-12.jpg"));
        list.add(new Student("c", "1-1-1", "hp", "https://th.bing.com/th/id/R.1c5193f51ad9e7c7ccdd7766a5f29113?rik=CJUIs6xelFnv1g&riu=http%3a%2f%2fthuthuatphanmem.vn%2fuploads%2f2018%2f09%2f11%2fhinh-anh-dep-11_044127919.jpg&ehk=HYnGHiCmwCg9jjQVYivEaTcby%2blBBfnJdu6%2bEEzi5Yc%3d&risl=&pid=ImgRaw&r=0"));
        list.add(new Student("d", "2-2-2", "nd", "https://wall.vn/wp-content/uploads/2020/04/anh-dep-viet-nam-17.jpg"));


        request.setAttribute("students", list);


        RequestDispatcher dispatcher = request.getRequestDispatcher("demo.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
