
package com.zensar.student.service;


import java.util.List;

import com.zensar.student.dto.Menu;

public interface MenuService {
   Menu createMenu(Menu menu);

   List<Menu> getAllMenus();

   Menu getMenuById(int menuId);
}
