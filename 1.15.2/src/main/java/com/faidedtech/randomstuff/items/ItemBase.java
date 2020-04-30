package com.faidedtech.randomstuff.items;

import com.faidedtech.randomstuff.RandomStuff;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

/**
 * Item class for the debug item
 * @author David Adams
 *
 */
public class ItemBase extends Item{

	/**
	 * Default Constructor
	 * @param properties
	 */
	public ItemBase() {
		super(new Item.Properties().group(RandomStuff.TAB));
	}

}
