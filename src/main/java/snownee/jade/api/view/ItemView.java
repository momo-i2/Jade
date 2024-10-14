package snownee.jade.api.view;

import java.util.List;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import snownee.jade.api.Accessor;
import snownee.jade.api.ui.IElement;
import snownee.jade.util.CommonProxy;

public class ItemView {

	public ItemStack item;
	@Nullable
	public String amountText;
	@Nullable
	public List<IElement> description;

	public ItemView(ItemStack item) {
		Objects.requireNonNull(item);
		this.item = item;
	}

	public static List<ViewGroup<ItemStack>> groupOf(Container container, Accessor<?> accessor) {
		return CommonProxy.containerGroup(container, accessor);
	}

	public ItemView amountText(String amountText) {
		this.amountText = amountText;
		return this;
	}

	public ItemView description(List<IElement> description) {
		this.description = description;
		return this;
	}

}
