package com.minevid.extrarandomthings.Recipes;

import com.minevid.extrarandomthings.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;


public class ModCrafting  {

    public static void initCrafting()
    {
        //EMPTY CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.emptyCard), "##", "##", '#',Items.REDSTONE);
        //ZOMBIE CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.zombieCard),"#I", '#', new ItemStack(Items.SKULL, 1, 2), 'I', ModItems.emptyCard);
        //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.zombieCard), new ItemStack(Items.SKULL,1,2), ModItems.emptyCard);
        //SKELETON CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.skeletonCard),"#I", '#', new ItemStack(Items.SKULL), 'I', ModItems.emptyCard);
        //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.skeletonCard), new ItemStack(Items.SKULL,1), ModItems.emptyCard);
        //ENDERMAN CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.endermanCard),"#I", '#', new ItemStack(Items.ENDER_EYE), 'I', ModItems.emptyCard);
        //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.endermanCard), Items.ENDER_EYE, ModItems.emptyCard);
        //BLAZE CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.blazeCard),"#I", '#', new ItemStack(Items.BLAZE_ROD), 'I', ModItems.emptyCard);
        //COW CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.cowCard), "#I", '#' ,new ItemStack(Items.LEATHER), 'I', ModItems.emptyCard);
        //CREEPER CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.creeperCard), "#I", '#', new ItemStack(Items.GUNPOWDER), 'I', ModItems.emptyCard);
        //ENDERMAN CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.endermanCard), "#I", '#', new ItemStack(Items.ENDER_PEARL), 'I', ModItems.emptyCard);
        //PIG CARD
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.pigCard), "#I", '#', new ItemStack(Items.PORKCHOP), 'I', new ItemStack(ModItems.emptyCard));
        //PolarbearCard
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.polarbearCard), "AB", 'A', new ItemStack(Blocks.ICE), 'B', new ItemStack(ModItems.emptyCard));
        //Sheep Card
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.sheepCard), "AB", 'A', new ItemStack(Blocks.WOOL),'B', new ItemStack(ModItems.emptyCard));
        //SquidCard
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.squidCard), "AB", 'A', new ItemStack(Items.DYE), 'B',new ItemStack(ModItems.emptyCard));
        //WitchCard
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.witchCard), "AB", 'A', new ItemStack(Items.SPIDER_EYE), 'B', new ItemStack(ModItems.emptyCard));
        //Knife
        GameRegistry.addShapedRecipe(new ItemStack(ModItems.knife), "  A"," A ","B  ", 'A', new ItemStack(Items.IRON_INGOT), 'B', new ItemStack(Items.STICK));
    }

}
