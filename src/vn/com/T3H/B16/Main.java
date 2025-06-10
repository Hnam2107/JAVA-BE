package vn.com.T3H.B16;

import B16.dao.ProductionDao;
import B16.dao.impl.ProductionDaoImpl;

public class Main {

    public static void main(String[] args) {
        ProductionDao productionDao = new ProductionDaoImpl();
        productionDao.showAllProductions();
    }
}