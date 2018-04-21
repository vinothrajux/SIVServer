package com.sivserver.example.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 30-Mar-18.
 */
public interface MenuListRepository extends JpaRepository<MenuList, MenuListCompoundKey> {

    MenuList findOneByMenulistcompoundkey(MenuListCompoundKey key);
//    MenuListWebAppProjection findOneByMenulistcompoundkey(MenuListCompoundKey key);
   // MenuListMobAppProjection findOneByMenulistcompoundkey(MenuListCompoundKey key1);
}
