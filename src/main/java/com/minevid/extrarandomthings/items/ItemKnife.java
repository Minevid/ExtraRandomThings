package com.minevid.extrarandomthings.items;

import com.minevid.extrarandomthings.creativetab.CreativeTabERT;
import com.minevid.extrarandomthings.references.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 6/03/2017.
 */
public class ItemKnife extends Item
{
    public ItemKnife()
    {
        setRegistryName("knife");
        setUnlocalizedName(Reference.MOD_ID + ".knife");
        GameRegistry.register(this);
        this.setCreativeTab(CreativeTabERT.ERT_TAB);
        setMaxDamage(32-1);
        setNoRepair();
        setMaxStackSize(1);

    }

    @Override
    public boolean hasContainerItem(ItemStack itemStack)
    {
        return true;
    }
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        ItemStack returnItem = new ItemStack(itemStack.getItem(),1,itemStack.getItemDamage()+1);
        if(itemStack.isItemEnchanted())
        {
            NBTTagCompound nbtTagCompound = itemStack.getTagCompound();
            returnItem.setTagCompound(nbtTagCompound);
        }

        return returnItem;
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
