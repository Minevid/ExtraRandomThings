package com.minevid.extrarandomthings.items;

import com.minevid.extrarandomthings.creativetab.CreativeTabERT;
import com.minevid.extrarandomthings.references.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Reynout on 6/03/2017.
 */
public class ItemRawFries extends ItemFood {
    private PotionEffect effect;
    public ItemRawFries(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);

        setRegistryName("rawfries");
        setUnlocalizedName(Reference.MOD_ID + ".rawfries");
        setCreativeTab(CreativeTabERT.ERT_TAB);
    }
    @Override
    public void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player)
    {

    }
}
