package com.zensar.student.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.student.dto.CustomerOrder;
import com.zensar.student.dto.Menu;
import com.zensar.student.service.CustomerOrderService;
import com.zensar.student.service.MenuService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private MenuService menuService;
	@Autowired
	private CustomerOrderService customerOrderService;

	@PostMapping("/createMenu")
	public ResponseEntity<Menu> createMenu(@RequestBody Menu menu) {
		Menu createMenu = this.menuService.createMenu(menu);
		return ResponseEntity.status(HttpStatus.CREATED).body(createMenu);
	}

	@GetMapping("/getAllMenus")
	public ResponseEntity<List<Menu>> getAllMenus() {
		List<Menu> menus = this.menuService.getAllMenus();
		return ResponseEntity.status(HttpStatus.OK).body(menus);
	}

	@GetMapping("/menu/{menuId}")
	public ResponseEntity<Menu> getMenuById(@PathVariable int menuId) {
		Menu menu = this.menuService.getMenuById(menuId);
		return ResponseEntity.status(HttpStatus.OK).body(menu);
	}

	@PostMapping({ "/customer/order" })
	public ResponseEntity<CustomerOrder> createCustomerOrder(@RequestBody CustomerOrder customerOrder) {
		CustomerOrder createdOrder = this.customerOrderService.createCustomerOrder(customerOrder);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
	}

	@GetMapping({ "/customer/{orderId}" })
	public ResponseEntity<CustomerOrder> getCustomerOrderById(@PathVariable int orderId) {
		CustomerOrder customerOrder = this.customerOrderService.getCustomerOrderById(orderId);
		return ResponseEntity.status(HttpStatus.OK).body(customerOrder);
	}

}
