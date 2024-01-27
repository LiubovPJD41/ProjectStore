package polyaeva.catalog;

import polyaeva.Identifiable;

public interface ForCatalog <T extends Identifiable> {

     void addToCatalog( T product);
     void removeFromCatalog(T product);
}
