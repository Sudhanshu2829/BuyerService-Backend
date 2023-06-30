package com.example.testbuyerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/0.2")
@CrossOrigin
public class MainRestController {
    @Autowired
    UsertypelinkRepository usertypelinkRepository;
    @Autowired
    ProductofferRepository productofferRepository;
    @Autowired
    OrderRepository orderRepository;
    @GetMapping("/getallproducts")
    public List<Productoffer> getallproducts(){
        return productofferRepository.findallProductDetails();
    }

    @GetMapping("/getproduct")
    public List<Productoffer> getProductByHscode(@RequestParam("HS CODE") String hscode){
        return productofferRepository.findProduct(hscode);
    }

    @PostMapping("/createorder")
    public Order createOrder(@RequestParam("username") String username,@RequestParam("offerid") String offerid,@RequestParam("productname") String productname,@RequestParam("qty") String qty){
        Order order=new Order();
        order.setOrderid(String.valueOf((int) (Math.random()*10000)));
        order.setUsername(username);
        order.setOfferid(offerid);
        order.setProductname(productname);
        order.setQty(qty);
        order.setOrderstatus("Pending,to be confirmed");
        orderRepository.save(order);
        return order;
    }




}
