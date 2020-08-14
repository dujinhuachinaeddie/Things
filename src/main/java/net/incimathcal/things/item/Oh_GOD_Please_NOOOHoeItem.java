
package net.incimathcal.things.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.incimathcal.things.ThingsModElements;

@ThingsModElements.ModElement.Tag
public class Oh_GOD_Please_NOOOHoeItem extends ThingsModElements.ModElement {
	@ObjectHolder("things:oh_god_please_nooo_hoe")
	public static final Item block = null;
	public Oh_GOD_Please_NOOOHoeItem(ThingsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3811;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 14;
			}

			public int getEnchantability() {
				return 98;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("oh_god_please_nooo_hoe"));
	}
}
