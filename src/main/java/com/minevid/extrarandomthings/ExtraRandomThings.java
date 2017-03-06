package com.minevid.extrarandomthings;

import com.minevid.extrarandomthings.handler.ConfigurationHandler;
import com.minevid.extrarandomthings.proxy.CommonProxy;
import com.minevid.extrarandomthings.references.Reference;
import com.minevid.extrarandomthings.utility.LogHelper;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
/**
 * Created by Reynout on 27/02/2017.
 */
public class ExtraRandomThings {

    @Mod.Instance(Reference.MOD_ID)
    public static ExtraRandomThings instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //INIT BLOCKS AND ITEMS
        proxy.preInit(event);
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization complete!");



    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        //GUI, RECIPY,...
        LogHelper.info("Initialization complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
        //WRAP UP

        LogHelper.info("Post Initialization complete");
    }
}
