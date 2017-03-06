package com.minevid.extrarandomthings.items;

import com.minevid.extrarandomthings.creativetab.CreativeTabERT;
import com.minevid.extrarandomthings.references.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.WeightedRandom;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by Reynout on 28/02/2017.
 */
public class ItemSkeletonCard extends Item {

    public ItemSkeletonCard() {
        super();
        setRegistryName("skeletoncard");
        setUnlocalizedName(Reference.MOD_ID + ".skeletoncard");
        GameRegistry.register(this);
        this.setCreativeTab(CreativeTabERT.ERT_TAB);
        setMaxDamage(64);
        setMaxStackSize(1);
        setNoRepair();

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }


}
