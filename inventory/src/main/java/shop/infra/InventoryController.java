package shop.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/inventories")
@Transactional
public class InventoryController {

    @Autowired
    InventoryRepository inventoryRepository;

    @GetMapping(path = "/inventories/productSearch")
    public List<Inventory> productSearch(
        ProductSearchQuery productSearchQuery
    ) {
        return inventoryRepository.productSearch(
            productSearchQuery.getProductName()
        );
    }
}
//>>> Clean Arch / Inbound Adaptor
