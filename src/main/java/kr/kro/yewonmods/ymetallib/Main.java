package kr.kro.yewonmods.ymetallib;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;

public class Main implements ModInitializer {
	
	public static final ItemGroup YMETALLIBGROUP = FabricItemGroupBuilder.build(
			new Identifier("ymetallib", "ymetallib_group"),
			() -> new ItemStack(Items.IRON_INGOT));

	//Hammer Wrench
	public static final Item HAMMER = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item WRENCH = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Blocks
	public static final Block TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(1.5F).requiresTool());
	public static final Block BRONZE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(2.5F).requiresTool());
	public static final Block LEAD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(1.5F).requiresTool());
	public static final Block SILVER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(1.5F).requiresTool());
	public static final Block PLATINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.5F).requiresTool());
	public static final Block NICKEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(2.0F).requiresTool());
	public static final Block INVAR_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(2.5F).requiresTool());
	public static final Block ELECTRUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.0F).requiresTool());
	public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.5F).requiresTool());
	public static final Block ALUMINUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(2.5F).requiresTool());
	public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0F).requiresTool());
	public static final Block TUNGSTEN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F).requiresTool());
	
	//Ingots
	public static final Item TIN_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LEAD_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item BRONZE_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SILVER_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item PLATINUM_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item NICKEL_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TITANIUM_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TUNGSTEN_INGOT = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Mixtures
	public static final Item BRONZE_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TITANIUM_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TUNGSTEN_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ACIDIC_TUNGSTEN_MIXTURE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Dusts
	public static final Item COPPER_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TIN_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LEAD_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item BRONZE_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SILVER_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item PLATINUM_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item NICKEL_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TITANIUM_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TUNGSTEN_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item IRON_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item GOLD_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item CARBON_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SULFUR_DUST = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Nuggets
	public static final Item COPPER_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TIN_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LEAD_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item BRONZE_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SILVER_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item PLATINUM_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item NICKEL_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TITANIUM_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TUNGSTEN_NUGGET = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	
	//Plates
	public static final Item BRONZE_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item STEEL_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item COPPER_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TIN_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LEAD_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item SILVER_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item PLATINUM_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item NICKEL_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item INVAR_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ELECTRUM_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item ALUMINUM_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TITANIUM_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TUNGSTEN_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item IRON_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item GOLD_PLATE = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));

	//Tin Cans
	public static final Item SULFURIC_ACID_TIN_CAN = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item TIN_CAN = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item AIR = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item WATER_TIN_CAN_ONE_THIRD = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item WATER_TIN_CAN_TWO_THIRD = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item WATER_TIN_CAN = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LAVA_TIN_CAN_ONE_THIRD = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LAVA_TIN_CAN_TWO_THIRD = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));
	public static final Item LAVA_TIN_CAN = new Item(new FabricItemSettings().group(Main.YMETALLIBGROUP));

	//Ores
	public static final Block TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5F).requiresTool());
	public static final Block NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F).requiresTool());
	public static final Block ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.5F).requiresTool());
	public static final Block TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F).requiresTool());
	public static final Block TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F).requiresTool());

	//Deepslate Ores
	public static final Block DEEPSLATE_TIN_ORE = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(3.0F).requiresTool());
	public static final Block DEEPSLATE_LEAD_ORE = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(3.0F).requiresTool());
	public static final Block DEEPSLATE_SILVER_ORE = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(3.0F).requiresTool());
	public static final Block DEEPSLATE_PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(6.0F).requiresTool());
	public static final Block DEEPSLATE_NICKEL_ORE = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(4.0F).requiresTool());
	public static final Block DEEPSLATE_ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(5.0F).requiresTool());
	public static final Block DEEPSLATE_TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(6.5F).requiresTool());
	public static final Block DEEPSLATE_TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(7.5F).requiresTool());

	//Diorite Ores
	public static final Block DIORITE_TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block DIORITE_LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block DIORITE_SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block DIORITE_PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5F).requiresTool());
	public static final Block DIORITE_NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F).requiresTool());
	public static final Block DIORITE_ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.5F).requiresTool());
	public static final Block DIORITE_TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F).requiresTool());
	public static final Block DIORITE_TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F).requiresTool());

	//Granite Ores
	public static final Block GRANITE_TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block GRANITE_LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block GRANITE_SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block GRANITE_PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5F).requiresTool());
	public static final Block GRANITE_NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F).requiresTool());
	public static final Block GRANITE_ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.5F).requiresTool());
	public static final Block GRANITE_TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F).requiresTool());
	public static final Block GRANITE_TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F).requiresTool());

	//Andesite Ores
	public static final Block ANDESITE_TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block ANDESITE_LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block ANDESITE_SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block ANDESITE_PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5F).requiresTool());
	public static final Block ANDESITE_NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F).requiresTool());
	public static final Block ANDESITE_ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.5F).requiresTool());
	public static final Block ANDESITE_TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F).requiresTool());
	public static final Block ANDESITE_TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F).requiresTool());

	//Nether Ores
	public static final Block NETHER_TIN_ORE = new Block(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(1.5F).requiresTool());
	public static final Block NETHER_LEAD_ORE = new Block(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(1.5F).requiresTool());
	public static final Block NETHER_SILVER_ORE = new Block(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(1.5F).requiresTool());
	public static final Block NETHER_PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(3.5F).requiresTool());
	public static final Block NETHER_NICKEL_ORE = new Block(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(2.0F).requiresTool());
	public static final Block NETHER_ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(2.5F).requiresTool());
	public static final Block NETHER_TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.NETHER_SHOOTS).strength(4.0F).requiresTool());
	public static final Block NETHER_TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F).requiresTool());

	//End Ores
	public static final Block END_TIN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block END_LEAD_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block END_SILVER_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F).requiresTool());
	public static final Block END_PLATINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5F).requiresTool());
	public static final Block END_NICKEL_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.0F).requiresTool());
	public static final Block END_ALUMINUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.5F).requiresTool());
	public static final Block END_TITANIUM_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(3.5F).requiresTool());
	public static final Block END_TUNGSTEN_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(5.0F).requiresTool());

	//Stone Ore Generation
	private static ConfiguredFeature<?, ?> ORE_TIN_STONE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.STONE),
					TIN_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_LEAD_STONE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.STONE),
					LEAD_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_SILVER_STONE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.STONE),
					SILVER_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_PLATINUM_STONE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.STONE),
					PLATINUM_ORE.getDefaultState(),
					1))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(10))))
			.spreadHorizontally()
			.repeat(1);
	private static ConfiguredFeature<?, ?> ORE_NICKEL_STONE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.STONE),
					NICKEL_ORE.getDefaultState(),
					4))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(60))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_ALUMINUM_STONE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.STONE),
					ALUMINUM_ORE.getDefaultState(),
					6))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(40))))
			.spreadHorizontally()
			.repeat(2);
	private static ConfiguredFeature<?, ?> ORE_TITANIUM_STONE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.STONE),
					TITANIUM_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(10))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_TUNGSTEN_STONE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.STONE),
					TUNGSTEN_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(5))))
			.spreadHorizontally()
			.repeat(2);

	//Deepslate Ore Generation
	private static ConfiguredFeature<?, ?> ORE_TIN_DEEPSLATE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DEEPSLATE),
					DEEPSLATE_TIN_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_LEAD_DEEPSLATE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DEEPSLATE),
					DEEPSLATE_LEAD_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_SILVER_DEEPSLATE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DEEPSLATE),
					DEEPSLATE_SILVER_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_PLATINUM_DEEPSLATE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DEEPSLATE),
					DEEPSLATE_PLATINUM_ORE.getDefaultState(),
					1))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(1);
	private static ConfiguredFeature<?, ?> ORE_NICKEL_DEEPSLATE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DEEPSLATE),
					DEEPSLATE_NICKEL_ORE.getDefaultState(),
					4))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_ALUMINUM_DEEPSLATE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DEEPSLATE),
					DEEPSLATE_ALUMINUM_ORE.getDefaultState(),
					6))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(2);
	private static ConfiguredFeature<?, ?> ORE_TITANIUM_DEEPSLATE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DEEPSLATE),
					DEEPSLATE_TITANIUM_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_TUNGSTEN_DEEPSLATE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DEEPSLATE),
					DEEPSLATE_TUNGSTEN_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(5))))
			.spreadHorizontally()
			.repeat(2);

	//Diorite Ore Generation
	private static ConfiguredFeature<?, ?> ORE_TIN_DIORITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DIORITE),
					DIORITE_TIN_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_LEAD_DIORITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DIORITE),
					DIORITE_LEAD_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_SILVER_DIORITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DIORITE),
					DIORITE_SILVER_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_PLATINUM_DIORITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DIORITE),
					DIORITE_PLATINUM_ORE.getDefaultState(),
					1))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(10))))
			.spreadHorizontally()
			.repeat(1);
	private static ConfiguredFeature<?, ?> ORE_NICKEL_DIORITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DIORITE),
					DIORITE_NICKEL_ORE.getDefaultState(),
					4))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(60))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_ALUMINUM_DIORITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DIORITE),
					DIORITE_ALUMINUM_ORE.getDefaultState(),
					6))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(40))))
			.spreadHorizontally()
			.repeat(2);
	private static ConfiguredFeature<?, ?> ORE_TITANIUM_DIORITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DIORITE),
					DIORITE_TITANIUM_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(10))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_TUNGSTEN_DIORITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.DIORITE),
					DIORITE_TUNGSTEN_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(5))))
			.spreadHorizontally()
			.repeat(2);

	//Granite Ore Generation
	private static ConfiguredFeature<?, ?> ORE_TIN_GRANITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.GRANITE),
					GRANITE_TIN_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_LEAD_GRANITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.GRANITE),
					GRANITE_LEAD_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_SILVER_GRANITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.GRANITE),
					GRANITE_SILVER_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_PLATINUM_GRANITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.GRANITE),
					GRANITE_PLATINUM_ORE.getDefaultState(),
					1))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(10))))
			.spreadHorizontally()
			.repeat(1);
	private static ConfiguredFeature<?, ?> ORE_NICKEL_GRANITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.GRANITE),
					GRANITE_NICKEL_ORE.getDefaultState(),
					4))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(60))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_ALUMINUM_GRANITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.GRANITE),
					GRANITE_ALUMINUM_ORE.getDefaultState(),
					6))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(40))))
			.spreadHorizontally()
			.repeat(2);
	private static ConfiguredFeature<?, ?> ORE_TITANIUM_GRANITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.GRANITE),
					GRANITE_TITANIUM_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(10))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_TUNGSTEN_GRANITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.GRANITE),
					GRANITE_TUNGSTEN_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(5))))
			.spreadHorizontally()
			.repeat(2);

	//Andesite Ore Generation
	private static ConfiguredFeature<?, ?> ORE_TIN_ANDESITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.ANDESITE),
					ANDESITE_TIN_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_LEAD_ANDESITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.ANDESITE),
					ANDESITE_LEAD_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_SILVER_ANDESITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.ANDESITE),
					ANDESITE_SILVER_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(20))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_PLATINUM_ANDESITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.ANDESITE),
					ANDESITE_PLATINUM_ORE.getDefaultState(),
					1))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(10))))
			.spreadHorizontally()
			.repeat(1);
	private static ConfiguredFeature<?, ?> ORE_NICKEL_ANDESITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.ANDESITE),
					ANDESITE_NICKEL_ORE.getDefaultState(),
					4))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(60))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_ALUMINUM_ANDESITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.ANDESITE),
					ANDESITE_ALUMINUM_ORE.getDefaultState(),
					6))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(20), YOffset.fixed(40))))
			.spreadHorizontally()
			.repeat(2);
	private static ConfiguredFeature<?, ?> ORE_TITANIUM_ANDESITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.ANDESITE),
					ANDESITE_TITANIUM_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(10))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_TUNGSTEN_ANDESITE = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.ANDESITE),
					ANDESITE_TUNGSTEN_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(5))))
			.spreadHorizontally()
			.repeat(2);

	//Nether Ore Generation
	private static ConfiguredFeature<?, ?> ORE_TIN_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.NETHERRACK),
					NETHER_TIN_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_LEAD_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.NETHERRACK),
					NETHER_LEAD_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_SILVER_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.NETHERRACK),
					NETHER_SILVER_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_PLATINUM_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.NETHERRACK),
					NETHER_PLATINUM_ORE.getDefaultState(),
					1))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(96), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(1);
	private static ConfiguredFeature<?, ?> ORE_NICKEL_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.NETHERRACK),
					NETHER_NICKEL_ORE.getDefaultState(),
					4))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_ALUMINUM_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.NETHERRACK),
					NETHER_ALUMINUM_ORE.getDefaultState(),
					6))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(2);
	private static ConfiguredFeature<?, ?> ORE_TITANIUM_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.NETHERRACK),
					NETHER_TITANIUM_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(96), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_TUNGSTEN_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.NETHERRACK),
					NETHER_TUNGSTEN_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(16))))
			.spreadHorizontally()
			.repeat(3);

	//End Ore Generation
	private static ConfiguredFeature<?, ?> ORE_TIN_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					END_TIN_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_LEAD_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					END_LEAD_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_SILVER_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					END_SILVER_ORE.getDefaultState(),
					8))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(5);
	private static ConfiguredFeature<?, ?> ORE_PLATINUM_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					END_PLATINUM_ORE.getDefaultState(),
					1))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(96), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(1);
	private static ConfiguredFeature<?, ?> ORE_NICKEL_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					END_NICKEL_ORE.getDefaultState(),
					4))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_ALUMINUM_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					END_ALUMINUM_ORE.getDefaultState(),
					6))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(2);
	private static ConfiguredFeature<?, ?> ORE_TITANIUM_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					END_TITANIUM_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(96), YOffset.fixed(128))))
			.spreadHorizontally()
			.repeat(3);
	private static ConfiguredFeature<?, ?> ORE_TUNGSTEN_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE),
					END_TITANIUM_ORE.getDefaultState(),
					3))
			.range(new RangeDecoratorConfig(
					UniformHeightProvider.create(YOffset.aboveBottom(0), YOffset.fixed(64))))
			.spreadHorizontally()
			.repeat(2);

	@Override
	public void onInitialize() {

		//Hammer Wrench
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "hammer"), HAMMER);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "wrench"), WRENCH);
		
		//Blocks
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "tin_block"), TIN_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "bronze_block"), BRONZE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "lead_block"), LEAD_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "silver_block"), SILVER_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "platinum_block"), PLATINUM_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nickel_block"), NICKEL_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "invar_block"), INVAR_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "electrum_block"), ELECTRUM_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "steel_block"), STEEL_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "aluminum_block"), ALUMINUM_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "titanium_block"), TITANIUM_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "tungsten_block"), TUNGSTEN_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_block"), new BlockItem(TIN_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_block"), new BlockItem(BRONZE_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_block"), new BlockItem(LEAD_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_block"), new BlockItem(SILVER_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_block"), new BlockItem(PLATINUM_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_block"), new BlockItem(NICKEL_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_block"), new BlockItem(INVAR_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_block"), new BlockItem(ELECTRUM_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_block"), new BlockItem(STEEL_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_block"), new BlockItem(ALUMINUM_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "titanium_block"), new BlockItem(TITANIUM_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tungsten_block"), new BlockItem(TUNGSTEN_BLOCK, new FabricItemSettings().group(Main.YMETALLIBGROUP)));

		//Ingots
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_ingot"), TIN_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_ingot"), BRONZE_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_ingot"), LEAD_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_ingot"), SILVER_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_ingot"), PLATINUM_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_ingot"), NICKEL_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_ingot"), INVAR_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_ingot"), ELECTRUM_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_ingot"), STEEL_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_ingot"), ALUMINUM_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "titanium_ingot"), TITANIUM_INGOT);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tungsten_ingot"), TUNGSTEN_INGOT);

		//Nuggets
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "copper_nugget"), COPPER_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_nugget"), TIN_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_nugget"), BRONZE_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_nugget"), LEAD_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_nugget"), SILVER_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_nugget"), PLATINUM_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_nugget"), NICKEL_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_nugget"), INVAR_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_nugget"), ELECTRUM_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_nugget"), STEEL_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_nugget"), ALUMINUM_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "titanium_nugget"), TITANIUM_NUGGET);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tungsten_nugget"), TUNGSTEN_NUGGET);


		//Mixtures
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_mixture"), BRONZE_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_mixture"), INVAR_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_mixture"), ELECTRUM_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_mixture"), STEEL_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_mixture"), ALUMINUM_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "titanium_mixture"), TITANIUM_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tungsten_mixture"), TUNGSTEN_MIXTURE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "acidic_tungsten_mixture"), ACIDIC_TUNGSTEN_MIXTURE);

		//Dusts
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "copper_dust"), COPPER_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_dust"), TIN_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_dust"), BRONZE_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_dust"), LEAD_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_dust"), SILVER_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_dust"), PLATINUM_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_dust"), NICKEL_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_dust"), INVAR_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_dust"), ELECTRUM_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_dust"), STEEL_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_dust"), ALUMINUM_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "titanium_dust"), TITANIUM_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tungsten_dust"), TUNGSTEN_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "iron_dust"), IRON_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "gold_dust"), GOLD_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "carbon_dust"), CARBON_DUST);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "sulfur_dust"), SULFUR_DUST);
		
		//Plates
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "bronze_plate"), BRONZE_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "steel_plate"), STEEL_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "copper_plate"), COPPER_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_plate"), TIN_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_plate"), LEAD_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_plate"), SILVER_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_plate"), PLATINUM_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_plate"), NICKEL_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "invar_plate"), INVAR_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "electrum_plate"), ELECTRUM_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_plate"), ALUMINUM_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "titanium_plate"), TITANIUM_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tungsten_plate"), TUNGSTEN_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "iron_plate"), IRON_PLATE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "gold_plate"), GOLD_PLATE);

		//Tin Cans
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "sulfuric_acid_tin_can"), SULFURIC_ACID_TIN_CAN);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_can"), TIN_CAN);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "air"), AIR);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "water_tin_can_one_third"), WATER_TIN_CAN_ONE_THIRD);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "water_tin_can_two_third"), WATER_TIN_CAN_TWO_THIRD);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "water_tin_can"), WATER_TIN_CAN);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lava_tin_can_one_third"), LAVA_TIN_CAN_ONE_THIRD);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lava_tin_can_two_third"), LAVA_TIN_CAN_TWO_THIRD);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lava_tin_can"), LAVA_TIN_CAN);

		//Ores
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "tin_ore"), TIN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "lead_ore"), LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "silver_ore"), SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "platinum_ore"), PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nickel_ore"), NICKEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "aluminum_ore"), ALUMINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "titanium_ore"), TITANIUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "tungsten_ore"), TUNGSTEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tin_ore"), new BlockItem(TIN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "lead_ore"), new BlockItem(LEAD_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "silver_ore"), new BlockItem(SILVER_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "platinum_ore"), new BlockItem(PLATINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nickel_ore"), new BlockItem(NICKEL_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "aluminum_ore"), new BlockItem(ALUMINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "titanium_ore"), new BlockItem(TITANIUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "tungsten_ore"), new BlockItem(TUNGSTEN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));

		//Deepslate Ores
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "deepslate_tin_ore"), DEEPSLATE_TIN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "deepslate_lead_ore"), DEEPSLATE_LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "deepslate_silver_ore"), DEEPSLATE_SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "deepslate_platinum_ore"), DEEPSLATE_PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "deepslate_nickel_ore"), DEEPSLATE_NICKEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "deepslate_aluminum_ore"), DEEPSLATE_ALUMINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "deepslate_titanium_ore"), DEEPSLATE_TITANIUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "deepslate_tungsten_ore"), DEEPSLATE_TUNGSTEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "deepslate_tin_ore"), new BlockItem(DEEPSLATE_TIN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "deepslate_lead_ore"), new BlockItem(DEEPSLATE_LEAD_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "deepslate_silver_ore"), new BlockItem(DEEPSLATE_SILVER_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "deepslate_platinum_ore"), new BlockItem(DEEPSLATE_PLATINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "deepslate_nickel_ore"), new BlockItem(DEEPSLATE_NICKEL_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "deepslate_aluminum_ore"), new BlockItem(DEEPSLATE_ALUMINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "deepslate_titanium_ore"), new BlockItem(DEEPSLATE_TITANIUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "deepslate_tungsten_ore"), new BlockItem(DEEPSLATE_TUNGSTEN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));

		//Diorite Ores
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "diorite_tin_ore"), DIORITE_TIN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "diorite_lead_ore"), DIORITE_LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "diorite_silver_ore"), DIORITE_SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "diorite_platinum_ore"), DIORITE_PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "diorite_nickel_ore"), DIORITE_NICKEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "diorite_aluminum_ore"), DIORITE_ALUMINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "diorite_titanium_ore"), DIORITE_TITANIUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "diorite_tungsten_ore"), DIORITE_TUNGSTEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "diorite_tin_ore"), new BlockItem(DIORITE_TIN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "diorite_lead_ore"), new BlockItem(DIORITE_LEAD_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "diorite_silver_ore"), new BlockItem(DIORITE_SILVER_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "diorite_platinum_ore"), new BlockItem(DIORITE_PLATINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "diorite_nickel_ore"), new BlockItem(DIORITE_NICKEL_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "diorite_aluminum_ore"), new BlockItem(DIORITE_ALUMINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "diorite_titanium_ore"), new BlockItem(DIORITE_TITANIUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "diorite_tungsten_ore"), new BlockItem(DIORITE_TUNGSTEN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));

		//Granite Ores
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "granite_tin_ore"), GRANITE_TIN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "granite_lead_ore"), GRANITE_LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "granite_silver_ore"), GRANITE_SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "granite_platinum_ore"), GRANITE_PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "granite_nickel_ore"), GRANITE_NICKEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "granite_aluminum_ore"), GRANITE_ALUMINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "granite_titanium_ore"), GRANITE_TITANIUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "granite_tungsten_ore"), GRANITE_TUNGSTEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "granite_tin_ore"), new BlockItem(GRANITE_TIN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "granite_lead_ore"), new BlockItem(GRANITE_LEAD_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "granite_silver_ore"), new BlockItem(GRANITE_SILVER_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "granite_platinum_ore"), new BlockItem(GRANITE_PLATINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "granite_nickel_ore"), new BlockItem(GRANITE_NICKEL_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "granite_aluminum_ore"), new BlockItem(GRANITE_ALUMINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "granite_titanium_ore"), new BlockItem(GRANITE_TITANIUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "granite_tungsten_ore"), new BlockItem(GRANITE_TUNGSTEN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));

		//Andesite Ores
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "andesite_tin_ore"), ANDESITE_TIN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "andesite_lead_ore"), ANDESITE_LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "andesite_silver_ore"), ANDESITE_SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "andesite_platinum_ore"), ANDESITE_PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "andesite_nickel_ore"), ANDESITE_NICKEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "andesite_aluminum_ore"), ANDESITE_ALUMINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "andesite_titanium_ore"), ANDESITE_TITANIUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "andesite_tungsten_ore"), ANDESITE_TUNGSTEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "andesite_tin_ore"), new BlockItem(ANDESITE_TIN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "andesite_lead_ore"), new BlockItem(ANDESITE_LEAD_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "andesite_silver_ore"), new BlockItem(ANDESITE_SILVER_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "andesite_platinum_ore"), new BlockItem(ANDESITE_PLATINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "andesite_nickel_ore"), new BlockItem(ANDESITE_NICKEL_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "andesite_aluminum_ore"), new BlockItem(ANDESITE_ALUMINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "andesite_titanium_ore"), new BlockItem(ANDESITE_TITANIUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "andesite_tungsten_ore"), new BlockItem(ANDESITE_TUNGSTEN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));

		//Nether Ores
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nether_tin_ore"), NETHER_TIN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nether_lead_ore"), NETHER_LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nether_silver_ore"), NETHER_SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nether_platinum_ore"), NETHER_PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nether_nickel_ore"), NETHER_NICKEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nether_aluminum_ore"), NETHER_ALUMINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nether_titanium_ore"), NETHER_TITANIUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "nether_tungsten_ore"), NETHER_TUNGSTEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nether_tin_ore"), new BlockItem(NETHER_TIN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nether_lead_ore"), new BlockItem(NETHER_LEAD_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nether_silver_ore"), new BlockItem(NETHER_SILVER_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nether_platinum_ore"), new BlockItem(NETHER_PLATINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nether_nickel_ore"), new BlockItem(NETHER_NICKEL_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nether_aluminum_ore"), new BlockItem(NETHER_ALUMINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nether_titanium_ore"), new BlockItem(NETHER_TITANIUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "nether_tungsten_ore"), new BlockItem(NETHER_TUNGSTEN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));

		//End Ores
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "end_tin_ore"), END_TIN_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "end_lead_ore"), END_LEAD_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "end_silver_ore"), END_SILVER_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "end_platinum_ore"), END_PLATINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "end_nickel_ore"), END_NICKEL_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "end_aluminum_ore"), END_ALUMINUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "end_titanium_ore"), END_TITANIUM_ORE);
		Registry.register(Registry.BLOCK, new Identifier("ymetallib", "end_tungsten_ore"), END_TUNGSTEN_ORE);
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "end_tin_ore"), new BlockItem(END_TIN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "end_lead_ore"), new BlockItem(END_LEAD_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "end_silver_ore"), new BlockItem(END_SILVER_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "end_platinum_ore"), new BlockItem(END_PLATINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "end_nickel_ore"), new BlockItem(END_NICKEL_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "end_aluminum_ore"), new BlockItem(END_ALUMINUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "end_titanium_ore"), new BlockItem(END_TITANIUM_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));
		Registry.register(Registry.ITEM, new Identifier("ymetallib", "end_tungsten_ore"), new BlockItem(END_TUNGSTEN_ORE, new FabricItemSettings().group(Main.YMETALLIBGROUP)));

		//Stone Ore Generation
		RegistryKey<ConfiguredFeature<?, ?>> oreTinStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tin_stone"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinStone.getValue(), ORE_TIN_STONE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinStone);
		RegistryKey<ConfiguredFeature<?, ?>> oreLeadStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_lead_stone"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadStone.getValue(), ORE_LEAD_STONE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadStone);
		RegistryKey<ConfiguredFeature<?, ?>> oreSilverStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_silver_stone"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverStone.getValue(), ORE_SILVER_STONE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverStone);
		RegistryKey<ConfiguredFeature<?, ?>> orePlatinumStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_platinum_stone"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumStone.getValue(), ORE_PLATINUM_STONE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePlatinumStone);
		RegistryKey<ConfiguredFeature<?, ?>> oreNickelStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_nickel_stone"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelStone.getValue(), ORE_NICKEL_STONE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelStone);
		RegistryKey<ConfiguredFeature<?, ?>> oreAluminumStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_aluminum_stone"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminumStone.getValue(), ORE_ALUMINUM_STONE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumStone);
		RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_titanium_stone"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumStone.getValue(), ORE_TITANIUM_STONE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumStone);
		RegistryKey<ConfiguredFeature<?, ?>> oreTungstenStone = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tungsten_stone"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTungstenStone.getValue(), ORE_TUNGSTEN_STONE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTungstenStone);

		//Deepslate Ore Generation
		RegistryKey<ConfiguredFeature<?, ?>> oreTinDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tin_deepslate"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinDeepslate.getValue(), ORE_TIN_DEEPSLATE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinDeepslate);
		RegistryKey<ConfiguredFeature<?, ?>> oreLeadDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_lead_deepslate"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadDeepslate.getValue(), ORE_LEAD_DEEPSLATE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadDeepslate);
		RegistryKey<ConfiguredFeature<?, ?>> oreSilverDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_silver_deepslate"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverDeepslate.getValue(), ORE_SILVER_DEEPSLATE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverDeepslate);
		RegistryKey<ConfiguredFeature<?, ?>> orePlatinumDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_platinum_deepslate"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumDeepslate.getValue(), ORE_PLATINUM_DEEPSLATE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePlatinumDeepslate);
		RegistryKey<ConfiguredFeature<?, ?>> oreNickelDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_nickel_deepslate"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelDeepslate.getValue(), ORE_NICKEL_DEEPSLATE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelDeepslate);
		RegistryKey<ConfiguredFeature<?, ?>> oreAluminumDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_aluminum_deepslate"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminumDeepslate.getValue(), ORE_ALUMINUM_DEEPSLATE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumDeepslate);
		RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_titanium_deepslate"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumDeepslate.getValue(), ORE_TITANIUM_DEEPSLATE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumDeepslate);
		RegistryKey<ConfiguredFeature<?, ?>> oreTungstenDeepslate = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tungsten_deepslate"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTungstenDeepslate.getValue(), ORE_TUNGSTEN_DEEPSLATE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTungstenDeepslate);

		//Diorite Ore Generation
		RegistryKey<ConfiguredFeature<?, ?>> oreTinDiorite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tin_diorite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinDiorite.getValue(), ORE_TIN_DIORITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinDiorite);
		RegistryKey<ConfiguredFeature<?, ?>> oreLeadDiorite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_lead_diorite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadDiorite.getValue(), ORE_LEAD_DIORITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadDiorite);
		RegistryKey<ConfiguredFeature<?, ?>> oreSilverDiorite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_silver_diorite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverDiorite.getValue(), ORE_SILVER_DIORITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverDiorite);
		RegistryKey<ConfiguredFeature<?, ?>> orePlatinumDiorite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_platinum_diorite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumDiorite.getValue(), ORE_PLATINUM_DIORITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePlatinumDiorite);
		RegistryKey<ConfiguredFeature<?, ?>> oreNickelDiorite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_nickel_diorite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelDiorite.getValue(), ORE_NICKEL_DIORITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelDiorite);
		RegistryKey<ConfiguredFeature<?, ?>> oreAluminumDiorite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_aluminum_diorite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminumDiorite.getValue(), ORE_ALUMINUM_DIORITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumDiorite);
		RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumDiorite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_titanium_diorite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumDiorite.getValue(), ORE_TITANIUM_DIORITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumDiorite);
		RegistryKey<ConfiguredFeature<?, ?>> oreTungstenDiorite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tungsten_diorite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTungstenDiorite.getValue(), ORE_TUNGSTEN_DIORITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTungstenDiorite);

		//Granite Ore Generation
		RegistryKey<ConfiguredFeature<?, ?>> oreTinGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tin_granite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinGranite.getValue(), ORE_TIN_GRANITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinGranite);
		RegistryKey<ConfiguredFeature<?, ?>> oreLeadGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_lead_granite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadGranite.getValue(), ORE_LEAD_GRANITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadGranite);
		RegistryKey<ConfiguredFeature<?, ?>> oreSilverGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_silver_granite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverGranite.getValue(), ORE_SILVER_GRANITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverGranite);
		RegistryKey<ConfiguredFeature<?, ?>> orePlatinumGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_platinum_granite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumGranite.getValue(), ORE_PLATINUM_GRANITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePlatinumGranite);
		RegistryKey<ConfiguredFeature<?, ?>> oreNickelGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_nickel_granite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelGranite.getValue(), ORE_NICKEL_GRANITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelGranite);
		RegistryKey<ConfiguredFeature<?, ?>> oreAluminumGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_aluminum_granite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminumGranite.getValue(), ORE_ALUMINUM_GRANITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumGranite);
		RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_titanium_granite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumGranite.getValue(), ORE_TITANIUM_GRANITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumGranite);
		RegistryKey<ConfiguredFeature<?, ?>> oreTungstenGranite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tungsten_granite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTungstenGranite.getValue(), ORE_TUNGSTEN_GRANITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTungstenGranite);

		//Andesite Ore Generation
		RegistryKey<ConfiguredFeature<?, ?>> oreTinAndesite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tin_andesite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinAndesite.getValue(), ORE_TIN_ANDESITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinAndesite);
		RegistryKey<ConfiguredFeature<?, ?>> oreLeadAndesite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_lead_andesite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadAndesite.getValue(), ORE_LEAD_ANDESITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadAndesite);
		RegistryKey<ConfiguredFeature<?, ?>> oreSilverAndesite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_silver_andesite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverAndesite.getValue(), ORE_SILVER_ANDESITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverAndesite);
		RegistryKey<ConfiguredFeature<?, ?>> orePlatinumAndesite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_platinum_andesite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumAndesite.getValue(), ORE_PLATINUM_ANDESITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, orePlatinumAndesite);
		RegistryKey<ConfiguredFeature<?, ?>> oreNickelAndesite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_nickel_andesite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelAndesite.getValue(), ORE_NICKEL_ANDESITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelAndesite);
		RegistryKey<ConfiguredFeature<?, ?>> oreAluminumAndesite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_aluminum_andesite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminumAndesite.getValue(), ORE_ALUMINUM_ANDESITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumAndesite);
		RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumAndesite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_titanium_andesite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumAndesite.getValue(), ORE_TITANIUM_ANDESITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumAndesite);
		RegistryKey<ConfiguredFeature<?, ?>> oreTungstenAndesite = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tungsten_andesite"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTungstenAndesite.getValue(), ORE_TUNGSTEN_ANDESITE);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreTungstenAndesite);

		//End Ore Generation
		RegistryKey<ConfiguredFeature<?, ?>> oreTinEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tin_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinEnd.getValue(), ORE_TIN_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinEnd);
		RegistryKey<ConfiguredFeature<?, ?>> oreLeadEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_lead_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadEnd.getValue(), ORE_LEAD_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadEnd);
		RegistryKey<ConfiguredFeature<?, ?>> oreSilverEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_silver_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverEnd.getValue(), ORE_SILVER_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverEnd);
		RegistryKey<ConfiguredFeature<?, ?>> orePlatinumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_platinum_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumEnd.getValue(), ORE_PLATINUM_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, orePlatinumEnd);
		RegistryKey<ConfiguredFeature<?, ?>> oreNickelEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_nickel_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelEnd.getValue(), ORE_NICKEL_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelEnd);
		RegistryKey<ConfiguredFeature<?, ?>> oreAluminumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_aluminum_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminumEnd.getValue(), ORE_ALUMINUM_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumEnd);
		RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_titanium_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumEnd.getValue(), ORE_TITANIUM_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumEnd);
		RegistryKey<ConfiguredFeature<?, ?>> oreTungstenEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tungsten_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTungstenEnd.getValue(), ORE_TUNGSTEN_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, oreTungstenEnd);

		//Nether Ore Generation
		RegistryKey<ConfiguredFeature<?, ?>> oreTinNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tin_nether"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinNether.getValue(), ORE_TIN_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreTinNether);
		RegistryKey<ConfiguredFeature<?, ?>> oreLeadNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_lead_nether"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreLeadNether.getValue(), ORE_LEAD_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreLeadNether);
		RegistryKey<ConfiguredFeature<?, ?>> oreSilverNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_silver_nether"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverNether.getValue(), ORE_SILVER_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreSilverNether);
		RegistryKey<ConfiguredFeature<?, ?>> orePlatinumNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_platinum_nether"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumNether.getValue(), ORE_PLATINUM_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, orePlatinumNether);
		RegistryKey<ConfiguredFeature<?, ?>> oreNickelNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_nickel_nether"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelNether.getValue(), ORE_NICKEL_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreNickelNether);
		RegistryKey<ConfiguredFeature<?, ?>> oreAluminumNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_aluminum_nether"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreAluminumNether.getValue(), ORE_ALUMINUM_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreAluminumNether);
		RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_titanium_nether"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumNether.getValue(), ORE_TITANIUM_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreTitaniumNether);
		RegistryKey<ConfiguredFeature<?, ?>> oreTungstenNether = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY,
				new Identifier("ymetallib", "ore_tungsten_nether"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTungstenNether.getValue(), ORE_TUNGSTEN_NETHER);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES, oreTungstenNether);
	}

}
