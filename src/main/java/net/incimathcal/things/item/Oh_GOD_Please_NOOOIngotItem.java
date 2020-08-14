
package net.incimathcal.things.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.incimathcal.things.ThingsModElements;

@ThingsModElements.ModElement.Tag
public class Oh_GOD_Please_NOOOIngotItem extends ThingsModElements.ModElement {
	@ObjectHolder("things:oh_god_please_nooo_ingot")
	public static final Item block = null;
	public Oh_GOD_Please_NOOOIngotItem(ThingsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("oh_god_please_nooo_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
