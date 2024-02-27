 // Source code is unavailable, and was generated by the Fernflower decompiler.
package com.zensar.student.service.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.student.dto.Menu;
import com.zensar.student.entity.MenuEntity;
import com.zensar.student.exception.InvalidMenuIdException;
import com.zensar.student.repository.MenuRepo;
import com.zensar.student.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
   @Autowired
   private MenuRepo menuRepo;
   @Autowired
   ModelMapper modelMapper;

   public Menu createMenu(Menu menu) {
      MenuEntity menuEntity = this.convertMenuDTOToMenuEntity(menu);
      if (menuEntity != null) {
         MenuEntity save = this.menuRepo.save(menuEntity);
         return menu;
      } else {
         throw new InvalidMenuIdException("" + menu);
      }
   }

   private MenuEntity convertMenuDTOToMenuEntity(Menu menu) {
      TypeMap<Menu, MenuEntity> typeMap = this.modelMapper.typeMap(Menu.class, MenuEntity.class);
      typeMap.addMappings((mapper) -> {
         mapper.map(Menu::getId, MenuEntity::setId);
         mapper.map(Menu::getName, MenuEntity::setName);
         mapper.map(Menu::getType, MenuEntity::setType);
         mapper.map(Menu::getPrice, MenuEntity::setPrice);
      });
      return (MenuEntity)this.modelMapper.map(menu, MenuEntity.class);
   }

   public List<Menu> getAllMenus() {
      List<MenuEntity> entityList = this.menuRepo.findAll();
      List<Menu> menuList = new ArrayList<Menu>();
      Iterator<MenuEntity> var4 = entityList.iterator();

      while(var4.hasNext()) {
         MenuEntity entity = (MenuEntity)var4.next();
         Menu menu = this.convertMenuEntityToMenuDTO(entity);
         menuList.add(menu);
      }

      return menuList;
   }

   public Menu getMenuById(int menuId) {
      Optional<MenuEntity> optionalMenu = menuRepo.findById(menuId);
      if (optionalMenu.isPresent()) {
         MenuEntity entity = (MenuEntity)optionalMenu.get();
         return this.convertMenuEntityToMenuDTO(entity);
      } else {
         throw new InvalidMenuIdException(""+ menuId);
      }
   }

   private Menu convertMenuEntityToMenuDTO(MenuEntity entity) {
      TypeMap<MenuEntity, Menu> typeMap = this.modelMapper.typeMap(MenuEntity.class, Menu.class);
      typeMap.addMappings((mapper) -> {
         mapper.map(MenuEntity::getId, Menu::setId);
         mapper.map(MenuEntity::getName, Menu::setName);
         mapper.map(MenuEntity::getType, Menu::setType);
         mapper.map(MenuEntity::getPrice, Menu::setPrice);
      });
      return (Menu)this.modelMapper.map(entity, Menu.class);
   }
}
