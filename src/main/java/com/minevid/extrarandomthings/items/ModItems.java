package com.minevid.extrarandomthings.items;

import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Reynout on 28/02/2017.
 */
public final class ModItems  {

    public static ItemEmptyCard emptyCard;
    public static ItemZombieCard zombieCard;
    public static ItemSkeletonCard skeletonCard;
    public static ItemEndermanCard endermanCard;
    public static ItemBatCard batCard;
    public static ItemBlazeCard blazeCard;
    public static ItemCowCard cowCard;
    public static ItemCreeperCard creeperCard;
    public static ItemPigCard pigCard;
    public static ItemPolarbearCard polarbearCard;
    public static ItemSheepCard sheepCard;
    public static ItemSquidCard squidCard;
    public static ItemWitchCard witchCard;
    public static ItemKnife knife;
    public static ItemRawFries rawFries;



    public static void init()
    {
        emptyCard = new ItemEmptyCard();
        zombieCard = new ItemZombieCard();
        skeletonCard = new ItemSkeletonCard();
        endermanCard = new ItemEndermanCard();
        batCard = new ItemBatCard();
        blazeCard = new ItemBlazeCard();
        cowCard = new ItemCowCard();
        creeperCard = new ItemCreeperCard();
        pigCard = new ItemPigCard();
        polarbearCard = new ItemPolarbearCard();
        sheepCard = new ItemSheepCard();
        squidCard = new ItemSquidCard();
        witchCard = new ItemWitchCard();
        knife = new ItemKnife();
        rawFries = new ItemRawFries(1,0.2F,false);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        emptyCard.initModel();
        zombieCard.initModel();
        skeletonCard.initModel();
        endermanCard.initModel();
        batCard.initModel();
        blazeCard.initModel();
        cowCard.initModel();
        creeperCard.initModel();
        pigCard.initModel();
        polarbearCard.initModel();
        sheepCard.initModel();
        squidCard.initModel();
        witchCard.initModel();
        knife.initModel();
        rawFries.initModel();
    }

}
