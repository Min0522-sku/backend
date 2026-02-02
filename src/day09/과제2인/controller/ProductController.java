package day09.과제2인.controller;

import day09.과제2인.model.dao.BuyDao;
import day09.과제2인.model.dao.ProductDao;
import day09.과제2인.model.dao.UserDao;

public class ProductController {
    private ProductController(){}
    private static final ProductController instance = new ProductController();
    public static ProductController getInstance(){
        return instance;
    }


    private UserDao UD = UserDao.getInstance();
    private BuyDao BD = BuyDao.getInstance();
    private ProductDao PD = ProductDao.getInstance();

    public boolean BuyProduct(int productNo){
        boolean result = BD.BuyProduct(productNo);
        return result;
    }
}
