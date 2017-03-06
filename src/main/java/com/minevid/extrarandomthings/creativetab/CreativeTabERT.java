package com.minevid.extrarandomthings.creativetab;

import com.minevid.extrarandomthings.items.ModItems;
import com.minevid.extrarandomthings.references.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Reynout on 28/02/2017.
 */
public class CreativeTabERT {
    public static final CreativeTabs ERT_TAB = new CreativeTabs(Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.zombieCard;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "Extra Random Things";
        }
    };

}
