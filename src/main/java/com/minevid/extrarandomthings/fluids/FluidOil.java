package com.minevid.extrarandomthings.fluids;

import com.minevid.extrarandomthings.references.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Reynout on 6/03/2017.
 */
public class FluidOil extends Fluid
{

    public FluidOil(String fluidName, ResourceLocation still, ResourceLocation flowing) {
        super(fluidName, still, flowing);
        setUnlocalizedName(Reference.MOD_ID+".oil");
        setDensity(10);
        setViscosity(1000);
        FluidRegistry.registerFluid(this);
        FluidRegistry.addBucketForFluid(this);

    }
}
