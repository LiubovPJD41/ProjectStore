package polyaeva.catalog;

import polyaeva.Identifiable;
import polyaeva.goods.Products;

import java.util.HashMap;


public class Catalog implements ForCatalog{
    private static Catalog catalog;
    private final HashMap <String, Products> storage = new HashMap<>();

    private Catalog() {

    }
    public static Catalog getCatalog() {
        if(catalog == null){
            catalog = new Catalog();
        }
        return catalog;
    }
    public HashMap <String, Products> getStorage(){
        return this.storage;
    }

    public boolean isEmpty(){
        return storage.isEmpty();
    }

    @Override
    public void addToCatalog(Identifiable product) {


        storage.put(product.getId(), (Products) product);
    }

    @Override
    public void removeFromCatalog(Identifiable product) {
        storage.remove(product.getId(),product);
    }
}
