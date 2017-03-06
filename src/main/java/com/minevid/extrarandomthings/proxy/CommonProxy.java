package com.minevid.extrarandomthings.proxy;

import com.minevid.extrarandomthings.Recipes.ModCrafting;
import com.minevid.extrarandomthings.items.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Reynout on 27/02/2017.
 */
public abstract class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

        ModItems.init();


    }

    public void init(FMLInitializationEvent event)
    {
        ModCrafting.initCrafting();

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
