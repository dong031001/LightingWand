package snownee.lightingwand.proxy;

import javax.annotation.OverridingMethodsMustInvokeSuper;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    @OverridingMethodsMustInvokeSuper
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @OverridingMethodsMustInvokeSuper
    public void init(FMLInitializationEvent event)
    {
    }

    @OverridingMethodsMustInvokeSuper
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
