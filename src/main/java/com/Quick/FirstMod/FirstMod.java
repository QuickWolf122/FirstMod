package com.Quick.FirstMod;

import com.Quick.FirstMod.Configurations.ConfigurationHandler;
import com.Quick.FirstMod.Reference.Reference;
import com.Quick.FirstMod.proxy.IProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class FirstMod
{
    @Mod.Instance
    public  static FirstMod instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }
    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
