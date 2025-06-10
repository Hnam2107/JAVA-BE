package vn.com.T3H.B16.dao;

import B16.model.ProductionDetailModel;
import B16.model.ProductionModel;

import java.util.List;

public interface ProductionDao {

    public void showAllProductions();

    public List<ProductionModel> getProductions();

    public List<ProductionDetailModel> getProductionDetails(List<Integer> idsProduction);
}
