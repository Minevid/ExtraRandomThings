package com.minevid.extrarandomthings.items;

import com.minevid.extrarandomthings.creativetab.CreativeTabERT;
import com.minevid.extrarandomthings.references.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 6/03/2017.
 */
public class ItemRawFries extends ItemFood {


    public ItemRawFries(int healAmount, float saturation, boolean isWolfFood) {
        super(healAmount, saturation, isWolfFood);
        setRegistryName("rawfries");
        setUnlocalizedName(Reference.MOD_ID + ".rawfries");
        setPotionEffect(new PotionEffect(MobEffects.HUNGER,600,0), 0.3F);
        setCreativeTab(CreativeTabERT.ERT_TAB);

    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
