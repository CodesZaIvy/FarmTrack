package com.ivy.farm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/farm")
public class FarmProduceServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve farm produce data (you can fetch this from a database)
        List<FarmProduce> farmProduces = new ArrayList<>();
        farmProduces.add(new FarmProduce("Tomato", "Vegetable", 100.0));
        farmProduces.add(new FarmProduce("Apple", "Fruit", 50.0));
        farmProduces.add(new FarmProduce("Carrot", "Vegetable", 75.0));

        // Set data in the request attribute
        request.setAttribute("farmProduces", farmProduces);

        // Forward the request to the farm.jsp page
        request.getRequestDispatcher("/views/farm.jsp").forward(request, response);
    }
}

